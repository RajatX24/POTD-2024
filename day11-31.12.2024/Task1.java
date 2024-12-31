//POTD-2024
//-----------
//DAY:11
//DATE:31/12/2024
//TASK1:Reverse Words in a String
//PROBLEM LINK:https://leetcode.com/problems/reverse-words-in-a-string/description/

//CODE:
class Solution {
    public String reverseWords(String s) {
        int len=s.length();
        StringBuilder word=new StringBuilder();
        StringBuilder sen=new StringBuilder();

        for(int i=len-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            if(i!=len-1 && ch==' ' && s.charAt(i+1)==' ')
                continue;

            if(ch!=' ')
                word.insert(0,ch);
            else
            {
                sen.append(word);
                sen.append(' ');
                word.setLength(0);
            }
        }

        sen.append(word);
        return sen.toString().trim();
    }
}

//TIME COMPLEXITY:O(N)
//SPACE COMPLEXITY:O(N)