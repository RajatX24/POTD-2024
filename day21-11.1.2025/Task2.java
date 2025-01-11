//POTD-2024
//-----------
//DAY:21
//DATE:11/12/2025
//TASK2:Minimum Capacity to Ship Within D Days
//PROBLEM LINK:https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
//CODE:
class Solution {
    long[] findMaxNSumOfAll(int weights[])
    {
        int max=weights[0];
        long sum=0;

        for(int i=0;i<weights.length;i++)
        {
            max=Math.max(max,weights[i]);
            sum+=weights[i];
        }

        return new long[]{max,sum};
    }

    boolean possibleToShip(int[] weights,int days,long capacity)
    {
        int daysSoFar=0;
        int currentLoad=0;

        for(int i=0;i<weights.length;i++)
        {
            if(currentLoad+weights[i]<=capacity)
                currentLoad+=weights[i];
            else
            {
                daysSoFar++;
                if(daysSoFar>days)
                    return false;
                currentLoad=weights[i];
            }
        }

        if(currentLoad>0)daysSoFar++;
        
        return daysSoFar<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        long res[]=findMaxNSumOfAll(weights);
        long low=res[0];
        long high=res[1];
        long ans=-1;

        while(low<=high)
        {
            long mid=low+(high-low)/2;

            if(possibleToShip(weights,days,mid))
            {
                ans=mid;
                high=mid-1;
            }
            else
                low=mid+1;
        }
        
        return (int)ans;
    }
}

//s-sum of elements of weights
//TIME COMPLEXITY:O(log(s))
//SPACE COMPLEXITY:O(1)