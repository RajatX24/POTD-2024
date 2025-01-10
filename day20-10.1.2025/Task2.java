//POTD-2024
//-----------
//DAY:20
//DATE:10/12/2025
//TASK2:Search in Rotated Sorted Array II
//PROBLEM LINK:https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
//CODE:
class Solution {
    public boolean search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;

        while(low<=high)
        {
            int mid = low + (high-low)/2;

            if(nums[mid]==target)
                return true;

            if(nums[low]==nums[mid] && nums[mid]==nums[high])
            {
                low++;
                high--;
                continue;
            }

            else if (nums[low]<=nums[mid])
            {
                if(nums[low]<=target && target<=nums[mid])
                    high=mid-1;
                else
                    low=mid+1;
            }
            else
            {
                if(nums[mid]<=target && target<=nums[high])
                    low=mid+1;
                else
                    high=mid-1;
            }
        }

        return false;
    }
}

//TIME COMPLEXITY:O(log(N))
//SPACE COMPLEXITY:O(1)