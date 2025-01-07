//POTD-2024
//-----------
//DAY:17
//DATE:7/12/2025
//TASK2:Search Insert Position
//PROBLEM LINK:https://leetcode.com/problems/search-insert-position/description/
//CODE:
class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;

        while(low<=high)
        {
            int mid = low + (high-low)/2;

            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target)
            {
                low=mid+1;
            }
            else
                high=mid-1;
        }

        return low;        
    }
}

//TIME COMPLEXITY:O(logN)
//SPACE COMPLEXITY:O(1)