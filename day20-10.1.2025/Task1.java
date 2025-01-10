//POTD-2024
//-----------
//DAY:20
//DATE:10/12/2025
//TASK1:Search a 2D Matrix II
//PROBLEM LINK:https://leetcode.com/problems/search-a-2d-matrix-ii/description/
//CODE:
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int cols=matrix[0].length;

        int row=0;
        int col=cols-1;

        while(row<rows && 0<=col)
        {
            if(matrix[row][col]==target)
                return true;
            else if(target<matrix[row][col])
                col--;
            else
                row++;
        }

        return false;
    }
}

//TIME COMPLEXITY:O(log(rows+cols))
//SPACE COMPLEXITY:O(1)