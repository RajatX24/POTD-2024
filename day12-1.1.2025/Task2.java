//POTD-2024
//-----------
//DAY:12
//DATE:1/12/2025
//TASK2:Jump Game
//PROBLEM LINK:https://leetcode.com/problems/jump-game/description/

//CODE:
class Solution {
    public boolean canJump(int[] nums) {
        boolean[] dp=new boolean[nums.length];
        return helper(nums,dp,0);
    }

    boolean helper(int[] nums,boolean[] dp,int currIndex)
    {
        if(currIndex>=nums.length)
            return false;
        
        if(dp[currIndex])
            return false;

        if(currIndex==nums.length-1)
            return true;

        if(nums.length-1-currIndex<=nums[currIndex])
            return true;

        int jumps=nums[currIndex];
        for(int i=1;i<=jumps;i++)
        {
            if(dp[currIndex+i])
                continue;

            boolean ans=helper(nums,dp,currIndex+i);
            if(ans)
                return true;
            dp[currIndex+i]=true;
        }
        return false;
    }
}

//TIME COMPLEXITY:O(N*N)
//SPACE COMPLEXITY:O(N)