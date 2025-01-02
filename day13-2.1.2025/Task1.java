//POTD-2024
//-----------
//DAY:13
//DATE:2/12/2025
//TASK1:Max Increase to Keep City Skyline
//PROBLEM LINK:https://leetcode.com/problems/max-increase-to-keep-city-skyline/description/?envType=problem-list-v2&envId=greedy

//CODE:
class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n=grid.length;
        int[] maxOfRows=new int[n];
        int[] maxOfCols=new int[n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                maxOfRows[i]=Math.max(maxOfRows[i],grid[i][j]);
                maxOfCols[j]=Math.max(maxOfCols[j],grid[i][j]);
            }
        }

        int ans=0;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int maxIncrease=Math.min(maxOfRows[i],maxOfCols[j]);
                ans+=maxIncrease-grid[i][j];
            }
        }

        return ans;
    }
}

//TIME COMPLEXITY:O(N^2)
//SPACE COMPLEXITY:O(N)