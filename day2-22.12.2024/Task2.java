//POTD-2024
//-----------
//DAY:2
//DATE:22/12/2024
//TASK1:Find Minimum Operations to Make All Elements Divisible by Three
//PROBLEM LINK:https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/

//CODE:

class Solution {
    public int minimumOperations(int[] nums) {
        int ops=0;
        for(int i=0;i<nums.length;i++)
        {
            ops+=nums[i]%3==0?0:1;
        }
        return ops;
    }
}

//TIME COMPLEXITY:O(N)
//SPACE COMPLEXITY:O(1)