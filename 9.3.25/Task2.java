// Minimal Cost
// https://www.geeksforgeeks.org/problems/minimal-cost/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=minimal-cost

// CODE

class Solution {
    public int minimizeCost(int k, int arr[]) {
        // code here
        int n = arr.length;
        int[] dp=new int[n];
        dp[0]=0;
        
        for(int i=1;i<n;i++)
        {
            int minCost=Integer.MAX_VALUE;
            for(int j=i-1;j>=Math.max(0,i-k);j--)
            {
                int cost=dp[j]+Math.abs(arr[i]-arr[j]);
                minCost=Math.min(minCost,cost);
            }
            dp[i]=minCost;
        }
        
        return dp[n-1];
    }
}

// T.C. - O(n)
// S.C. - O(n)