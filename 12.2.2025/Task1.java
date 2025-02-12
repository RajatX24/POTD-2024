// Minimum Number of K Consecutive Bit Flips
// https://leetcode.com/problems/minimum-number-of-k-consecutive-bit-flips/description/

class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int curr_window_flips=0;
        int numberOfFlips=0;

        for(int i=0;i<nums.length;i++)
        {
            if(i-k>=0 && nums[i-k]==2)
                curr_window_flips--;

            if((nums[i]+curr_window_flips)%2==0)
            {
                if(i+k>nums.length)
                    return -1;
                numberOfFlips++;
                curr_window_flips++;
                nums[i]=2;
            }
        }
        return numberOfFlips;
    }
}

// tc - O(n)
// sc - O(1)