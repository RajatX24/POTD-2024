//POTD-2024
//-----------
//DAY:1
//DATE:21/12/2024
//TASK2:GCD
//PROBLEM LINK:https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1

//CODE:

class Solution {
    public static int gcd(int a, int b) {
        while(b!=0)
        {
            int rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
}

//TIME COMPLEXITY:O( log( min(a,b) ) )
//SPACE COMPLEXITY:O(1)