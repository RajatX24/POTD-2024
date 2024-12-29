//POTD-2024
//-----------
//DAY:8
//DATE:28/12/2024
//TASK1:1D->2D Array
//PROBLEM LINK:https://leetcode.com/problems/convert-1d-array-into-2d-array/description/

//CODE:
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length!=m*n)
            return new int[0][];

        int[][] res=new int[m][n];
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                res[i][j]=original[i*n+j];
            }
        }

        return res;
    }
}

//TIME COMPLEXITY:O(m*n)
//SPACE COMPLEXITY:O(1)