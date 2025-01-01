//POTD-2024
//-----------
//DAY:12
//DATE:1/12/2025
//TASK1:Three Divisors
//PROBLEM LINK:https://leetcode.com/problems/three-divisors/description/

//CODE:
class Solution {
    public boolean isThree(int n) {
        int divCount=0;
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                divCount++;
                if(n/i!=i)
                    divCount++;
                    
                if(divCount>3)
                    return false;
            }
        }

        return divCount == 3;
    }
}

//TIME COMPLEXITY:O(sqrt(N))
//SPACE COMPLEXITY:O(1)