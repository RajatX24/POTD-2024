//POTD-2024
//-----------
//DAY:5
//DATE:25/12/2024
//TASK1:Assign Cookies
//PROBLEM LINK:https://leetcode.com/problems/assign-cookies

//CODE:

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        int cookieIndex=0;
        int childIndex=0;

        while(childIndex<g.length&&cookieIndex<s.length)
        {
            if(s[cookieIndex]>=g[childIndex])
            {
                childIndex++;
            }
            cookieIndex++;
        }

        return childIndex;
    }
}

// let x=max(g.length,s.length)
//TIME COMPLEXITY:O(xlog(x))
//SPACE COMPLEXITY:O(x)