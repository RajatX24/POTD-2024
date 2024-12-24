//POTD-2024
//-----------
//DAY:4
//DATE:24/12/2024
//TASK1:Dutch National Flag Algorithm
//PROBLEM LINKhttps://leetcode.com/problems/sort-colors/

//CODE:

class Solution {
    public void sortColors(int[] nums) {
        int zerop=-1,twop=nums.length,i=0;

        while(i<twop)
        {
            if(nums[i]==1)
            {
                i++;
            }
            else if(nums[i]==0)
            {
                swap(nums,zerop+1,i);
                zerop++;
                i++;
            }
            else
            {
                swap(nums,twop-1,i);
                twop--;
            }
        }
    }

    void swap(int[] arr,int i,int j)
    {
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
}


//TIME COMPLEXITY:O(n)
//SPACE COMPLEXITY:O(1)