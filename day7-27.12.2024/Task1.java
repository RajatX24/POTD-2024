//POTD-2024
//-----------
//DAY:7
//DATE:27/12/2024
//TASK1:Happy Number
//PROBLEM LINK:https://leetcode.com/problems/happy-number

//CODE:
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs=new HashSet<>();
        int sum=0;
        while (!hs.contains(n))
        {
            hs.add(n);
            while (n>0)
            {
                int d=n%10;
                n=n/10;
                sum+=d*d;
            }
            
            if(sum==1)
                return true;
            
            n=sum;
            sum=0;
        }
        return false;
    }
}

//TIME COMPLEXITY:O(log(n))
//SPACE COMPLEXITY:O(1)