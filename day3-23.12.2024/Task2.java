//POTD-2024
//-----------
//DAY:3
//DATE:23/12/2024
//TASK2:Minimum Moves to Convert String
//PROBLEM LINK:https://leetcode.com/problems/minimum-moves-to-convert-string/

//CODE:
class Solution {
    public int minimumMoves(String s) {
        int moves=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='X')
            {
                moves++;
                i+=2;
            }
        }
        return moves;
    }
}
//TIME COMPLEXITY:O(n)
//SPACE COMPLEXITY:O(1)