//POTD-2024
//-----------
//DAY:15
//DATE:4/12/2025
//TASK1:Minimum Number of Operations to Move All Balls to Each Box
//PROBLEM LINK:https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/description/
//CODE:
class Solution {
    public int[] minOperations(String boxes) {
        int onesOnLeft=0;
        int onesOnRight=0;
        int leftScore=0;
        int rightScore=0;

        for(int i=1;i<boxes.length();i++)
        {
            if(boxes.charAt(i)=='1')
            {
                rightScore+=i;
                onesOnRight++;
            }
        }

        int[] answers=new int[boxes.length()];
        answers[0]=leftScore+rightScore;

        for(int i=1;i<boxes.length();i++)
        {
            if(boxes.charAt(i-1)=='1')
                onesOnLeft++;
            if(boxes.charAt(i)=='1')
            {
                onesOnRight--;
                rightScore--;
            }
            leftScore+=onesOnLeft;
            rightScore-=onesOnRight;
            answers[i]=leftScore+rightScore;
        }

        return answers;
    }
}

//TIME COMPLEXITY:O(N)
//SPACE COMPLEXITY:O(1)