//POTD-2024
//-----------
//DAY:18
//DATE:8/12/2025
//TASK1:Search a 2D Matrix
//PROBLEM LINK:https://leetcode.com/problems/search-a-2d-matrix/description/
//CODE:
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int l=0;
        int r=rows-1;
        int ans=-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(matrix[mid][0]<=target && matrix[mid][cols-1]>=target)
            {
                ans=mid;
                break;
            }
            else if(matrix[mid][0]>target)
                r=mid-1;
            else
                l=mid+1;
        }

        if(ans==-1)
            return false;

        l=0;
        r=cols-1;

        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(matrix[ans][mid]==target)
                return true;
            else if(matrix[ans][mid]>target)
                r=mid-1;
            else
                l=mid+1;
        }

        return false;

    }
}


//TIME COMPLEXITY:O(log(rows)+log(cols))
//SPACE COMPLEXITY:O(1)