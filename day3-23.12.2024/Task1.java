//POTD-2024
//-----------
//DAY:3
//DATE:23/12/2024
//TASK1:How Many Numbers Are Smaller Than the Current Number
//PROBLEM LINK:https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

//CODE:

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sortedNums=Arrays.copyOf(nums,nums.length);
        Arrays.sort(sortedNums);
        int[] ans=new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            if(i!=0 && nums[i]==nums[i-1])
                ans[i]=ans[i-1];
            else
                ans[i]=binSearch(sortedNums,nums[i]);
        }

        return ans;
    }

    int binSearch(int[] arr,int target)
    {
        int l=0;
        int r=arr.length;
        int ans=-1;

        while(l<=r)
        {
            int mid=l+(r-l)/2;

            if(arr[mid]==target)
            {
                ans=mid;
                r=mid-1;
            }
            else if(arr[mid]<target)
                l=mid+1;
            else
                r=mid-1;
        }

        return ans;
    }
}

//TIME COMPLEXITY:O(nlogn)
//SPACE COMPLEXITY:O(n)