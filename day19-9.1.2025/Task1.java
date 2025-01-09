//POTD-2024
//-----------
//DAY:19
//DATE:9/12/2025
//TASK1:Find Peak Element
//PROBLEM LINK:https://leetcode.com/problems/find-peak-element/
//CODE:
class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        if(n==1)return 0;

        if(nums[0]>nums[1])return 0;
        if(nums[n-1]>nums[n-2])return n-1;

        int low=1;
        int high=nums.length-2;

        while(low<=high)
        {
            int mid=low + (high-low)/2;

            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])
                return mid;

            if(nums[mid+1]>nums[mid])
                low=mid+1;
            else
                high=mid-1;
        }

        return -1;
    }
}


//TIME COMPLEXITY:O(log(rows)+log(cols))
//SPACE COMPLEXITY:O(1)