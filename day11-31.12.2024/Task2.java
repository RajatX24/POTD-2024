//POTD-2024
//-----------
//DAY:11
//DATE:31/12/2024
//TASK2:Longest Common Prefix
//PROBLEM LINK:https://leetcode.com/problems/longest-common-prefix/description/

//CODE:
class Solution {
    public String longestCommonPrefix(String[] v) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(v);
        String first = v[0];
        String last = v[v.length-1];
        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
}

//TIME COMPLEXITY:O(NlogN)
//SPACE COMPLEXITY:O(1)