//POTD-2024
//-----------
//DAY:16
//DATE:6/12/2025
//TASK2:Binary Search
//PROBLEM LINK:https://leetcode.com/problems/binary-search/description/
//CODE:

//iterative solution
class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;

        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }

        return -1;
    }
}
//TIME COMPLEXITY:O(logN)
//SPACE COMPLEXITY:O(1)



//recursive version
class Solution {
    public int search(int[] nums, int target) {
        return bs(nums,0,nums.length-1,target);
    }

    int bs(int[] nums,int low,int high,int target)
    {
        if(low>high)
            return -1;
        
        int mid=low+(high-low)/2;

        if(nums[mid]==target)
            return mid;
        else if(target<nums[mid])
            return bs(nums,low,mid-1,target);
        else
            return bs(nums,mid+1,high,target);
    }
}
//TIME COMPLEXITY:O(logN)
//SPACE COMPLEXITY:O(logN)