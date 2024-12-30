//POTD-2024
//-----------
//DAY:10
//DATE:30/12/2024
//TASK1:Product of Array Except Self
//PROBLEM LINK:https://leetcode.com/problems/product-of-array-except-self/description/

//CODE:

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixProd=new int[nums.length];
        int[] suffixProd=new int[nums.length];

        int prod=1;

        for(int i=0;i<nums.length;i++)
        {
            prod=prod*nums[i];
            prefixProd[i]=prod;
        }

        prod=1;

        for(int i=nums.length-1;i>=0;i--)
        {
            prod=prod*nums[i];
            suffixProd[i]=prod;
        }

        int[] answers=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int left=i==0?1:prefixProd[i-1];
            int right=i==nums.length-1?1:suffixProd[i+1];
            answers[i]=left*right;
        }

        return answers;
    }
}

//TIME COMPLEXITY:O(N)
//SPACE COMPLEXITY:O(N)