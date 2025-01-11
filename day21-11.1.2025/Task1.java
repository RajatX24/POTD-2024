//POTD-2024
//-----------
//DAY:21
//DATE:11/12/2025
//TASK1:Koko Eating Bananas
//PROBLEM LINK:https://leetcode.com/problems/koko-eating-bananas/
//CODE:
class Solution {
    int maxOfArray(int[] piles)
    {
        int maxArr=piles[0];

        for(int i=1;i<piles.length;i++)
        {
            maxArr=Math.max(maxArr,piles[i]);
        }

        return maxArr;
    }

    boolean canFinish(int[] piles,int h,int k)
    {
        for(int i=0;i<piles.length;i++)
        {
            int bananas=piles[i];

            if(bananas<=k)
            {
                h--;
            }
            else
            {
                h-=bananas%k==0?bananas/k:bananas/k+1;
            }

            if(h<0)
                return false;
        }

        return true;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=maxOfArray(piles);
        int ans=-1;

        while(low<=high)
        {
            int mid = low + (high-low)/2;
            boolean res = canFinish(piles,h,mid);
            if(res)
            {
                ans=mid;
                high=mid-1;
            }
            else
                low=mid+1;
        }

        return ans;
    }
}

//s-sum of elements of piles
//TIME COMPLEXITY:O(log(s))
//SPACE COMPLEXITY:O(1)