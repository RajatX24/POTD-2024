//POTD-2024
//-----------
//DAY:22
//DATE:12/12/2025
//TASK1:Aggressive Cows
//PROBLEM LINK:https://www.geeksforgeeks.org/problems/aggressive-cows
//CODE:


// User function Template for Java
class Solution {
    static int diffOfMaxNMin(int[] stalls)
    {
        int min=stalls[0];
        int max=stalls[0];
        
        for(int i=0;i<stalls.length;i++)
        {
            min=Math.min(min,stalls[i]);
            max=Math.max(max,stalls[i]);
        }
        
        return max-min;
    }
    
    static boolean canPlaceCowsAtMinGap(int[] stalls,int cowsToPlace,int mingap)
    {
        //place 1st cow at 0th
        //next at min index>=0+gap
        cowsToPlace--;
        int lastIndex=0;
        int currentIndex=1;
        while(cowsToPlace>0 && currentIndex<stalls.length)
        {
            if(stalls[currentIndex]-stalls[lastIndex]>=mingap)
            {
                //placing a cow at currentIndex
                cowsToPlace--;
                lastIndex=currentIndex;
                currentIndex++;
            }
            else
                currentIndex++;
        }
        
        return cowsToPlace==0;
    }
    
    public static int solve(int n, int k, int[] stalls) {
        int low=1;
        int high=diffOfMaxNMin(stalls);
        int ans=-1;
        Arrays.sort(stalls);
        
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(canPlaceCowsAtMinGap(stalls,k,mid))
            {
                ans=mid;
                low=mid+1;
            }
            else
                high=mid-1;
            
        }
        
        return ans;
    }
}

//m-difference of max and min of two stalls
//s-stalls
//TIME COMPLEXITY:O(slog(m))
//SPACE COMPLEXITY:O(1)