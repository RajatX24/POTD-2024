// The k-th Lexicographical String of All Happy Strings of Length n
// https://leetcode.com/problems/the-k-th-lexicographical-string-of-all-happy-strings-of-length-n/description/?envType=problem-list-v2&envId=backtracking

// CODE 

class Solution {
    public String getHappyString(int n, int k) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            sb.append(i%2==0?'a':'b');
        }
        return helper(k,sb,1,n-1);
    }

    String helper(int k,StringBuilder sb,int happyStrCount,int currIdx)
    {
        if(happyStrCount==k)
            return sb.toString();

        char ch=sb.charAt(currIdx);
        
        if(currIdx==0)
        {
            if(++ch>'c')
            {
                return "";
            }
            else
            {
                sb.setCharAt(currIdx,ch);
                boolean firstb=ch=='a';
                for(int i=1;i<sb.length();i++)
                {
                    if(firstb)
                    {
                        sb.setCharAt(i,'b');
                    }
                    else
                    {
                        sb.setCharAt(i,'a');
                    }
                    firstb=!firstb;
                }
                return helper(k,sb,happyStrCount+1,sb.length()-1);
            }
        }

        char prevCh=sb.charAt(currIdx-1);
        ch++;
        if(prevCh==ch)
            ch++;
        
        if(ch>'c')
            return helper(k,sb,happyStrCount,currIdx-1);
        else
        {
            sb.setCharAt(currIdx,ch);
            boolean firstb=ch=='a';
            for(int i=currIdx+1;i<sb.length();i++)
            {
                if(firstb)
                {
                    sb.setCharAt(i,'b');
                }
                else
                {
                    sb.setCharAt(i,'a');
                }
                firstb=!firstb;
            }
            return helper(k,sb,happyStrCount+1,sb.length()-1);
        }
    }
}

// H - numberOfHappyStringPossible
// T.C. - n + n*H
// S.C. - n + max(number of Happy String starting with a,b or c)

// A.I. anaylzed time complexity
// T.C. - 3^n
// S.C. - n 