//POTD-2024
//-----------
//DAY:16
//DATE:6/12/2025
//TASK1:Floor in a Sorted Array
//PROBLEM LINK:https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1
//CODE:
class Solution {

    static int findFloor(int[] arr, int k) {
        // write code here
        int l=0;
        int r=arr.length-1;
        int ans=-1;
        
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(arr[mid]<=k)
            {
                ans=mid;
                l=mid+1;
            }
            else
                r=mid-1;
        }
        
        return ans;
    }
}
//TIME COMPLEXITY:O(logN)
//SPACE COMPLEXITY:O(1)