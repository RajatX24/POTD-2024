//POTD-2024
//-----------
//DAY:2
//DATE:22/12/2024
//TASK1:SINGLE NUMBER
//PROBLEM LINK:https://leetcode.com/problems/single-number/

//CODE:

class Solution {
    public int singleNumber(int[] nums) {
        int xored=0;
        for(int i=0;i<nums.length;i++)
        {
            xored=xored^nums[i];
        }
        return xored;
    }
}

//TIME COMPLEXITY:O(N)
//SPACE COMPLEXITY:O(1)