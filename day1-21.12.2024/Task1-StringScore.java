//POTD-2024
//-----------
//DAY:1
//DATE:21/12/2024
//TASK1:STRING SCORE
//PROBLEM LINK:https://leetcode.com/problems/score-of-a-string/

//CODE:

class Solution {
    public int scoreOfString(String s) {
        int score=0;
        for(int i=0;i<s.length()-1;i++)
        {
            score+=Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        return score;
    }
}

//TIME COMPLEXITY:O(N)
//SPACE COMPLEXITY:O(1)