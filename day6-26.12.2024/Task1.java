//POTD-2024
//-----------
//DAY:6
//DATE:26/12/2024
//TASK1:Number of Laser Beams in a Bank
//PROBLEM LINK:https://leetcode.com/problems/number-of-laser-beams-in-a-bank

//CODE:

class Solution {
    public int numberOfBeams(String[] bank) {
        int lastRowDevCount=0;
        int totalbeams=0;

        for(int i=0;i<bank.length;i++)
        {
            int currentRowDevCount=0;

            for(int j=0;j<bank[0].length();j++)
            {
                if(bank[i].charAt(j)=='1')
                    currentRowDevCount++;

            }

            totalbeams+=lastRowDevCount*currentRowDevCount;
            if(currentRowDevCount!=0)
                lastRowDevCount=currentRowDevCount;
        }

        return totalbeams;
    }
}

//m=bank.length and n=bank[0].length
//TIME COMPLEXITY:O(m*n)
//SPACE COMPLEXITY:O(1)