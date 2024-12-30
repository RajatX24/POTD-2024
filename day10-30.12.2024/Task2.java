//POTD-2024
//-----------
//DAY:10
//DATE:30/12/2024
//TASK2:Partitioning Into Minimum Number Of Deci-Binary Numbers
//PROBLEM LINK:https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/description/

//CODE:

class Solution {
    public int minPartitions(String n) {
        boolean[] digits=new boolean[10];
        int digitsFound=0;
        for(int i=0;i<n.length();i++)
        {
            int digit=n.charAt(i)-48;
            if(!digits[digit])
            {
                digits[digit]=true;
                digitsFound++;
                if(digitsFound==10)
                    break;
            }
        }

        int ans=0;
        int last=0;

        for(int i=0;i<10;i++)
        {
            if(digits[i])
            {
                ans+=i-last;
                last=i;
            }
        }

        return ans;
    }
}

//TIME COMPLEXITY:O(N)
//SPACE COMPLEXITY:O(1)