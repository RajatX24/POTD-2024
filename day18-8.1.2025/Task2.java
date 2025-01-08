//POTD-2024
//-----------
//DAY:18
//DATE:8/12/2025
//TASK2:Find nth root of m
//PROBLEM LINK:https://www.geeksforgeeks.org/problems/find-nth-root-of-m5843/1
//CODE:
class Solution {
    public int nthRoot(int n, int m) {
        // code here
        int l=1;
        int r=m;
        
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            long res=(long)Math.pow(mid,n);
            if(res==m)
                return mid;
            else if(res<m)
                l=mid+1;
            else
                r=mid-1;
        }
        
        return -1;
    }
}


//TIME COMPLEXITY:O(log(m))
//SPACE COMPLEXITY:O(1)