//POTD-2024
//-----------
//DAY:17
//DATE:7/12/2025
//TASK1:Arranging Coins
//PROBLEM LINK:https://leetcode.com/problems/arranging-coins/description/
//CODE:
class Solution {
    public int arrangeCoins(int n) {
        long l=1;
        long r=n;
        long ans=-1;

        while(l<=r)
        {
            long mid=l+(r-l)/2;
            if(canMakeRows(mid,n))
            {
                ans=mid;
                l=mid+1;
            }
            else
                r=mid-1;
        }

        return (int)ans;
    }

    boolean canMakeRows(long rows,int n)
    {
        long coins=rows*(rows+1)/2;
        return n>=coins;
    }

}


//TIME COMPLEXITY:O(logN)
//SPACE COMPLEXITY:O(1)