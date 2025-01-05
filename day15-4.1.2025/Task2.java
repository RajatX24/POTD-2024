//POTD-2024
//-----------
//DAY:15
//DATE:5/12/2025
//TASK1:Remove Colored Pieces if Both Neighbors are the Same Color
//PROBLEM LINK:https://leetcode.com/problems/remove-colored-pieces-if-both-neighbors-are-the-same-color/description/
//CODE:
class Solution {
    public boolean winnerOfGame(String colors) {
        int aliceMoves=0;
        int bobMoves=0;
        int lenOfAs=0;
        int lenOfBs=0;

        for(int i=0;i<colors.length();i++)
        {
            char currChar=colors.charAt(i);
            if(currChar=='A')
            {
                lenOfAs++;
                bobMoves+=findNumberOfMoves(lenOfBs);
                lenOfBs=0;
            }
            else
            {
                lenOfBs++;
                aliceMoves+=findNumberOfMoves(lenOfAs);
                lenOfAs=0;
            }
        }

        char lastChar=colors.charAt(colors.length()-1);
        if(lastChar=='A')
        {
            aliceMoves+=findNumberOfMoves(lenOfAs);
        }
        else
        {
            bobMoves+=findNumberOfMoves(lenOfBs);
        }

        return aliceMoves>bobMoves;
    }

    int findNumberOfMoves(int n)
    {
        int count=0;
        while(n>=3)
        {
            count+=n/3;
            n-=n/3;
        }
        return count;
    }
}

//TIME COMPLEXITY:O(N)
//SPACE COMPLEXITY:O(1)