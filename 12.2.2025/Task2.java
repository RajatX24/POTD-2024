// Maximum Product of Word Lengths
// https://leetcode.com/problems/maximum-product-of-word-lengths/description/

class Solution {
    public int maxProduct(String[] words) {
        if(words==null || words.length==0)
            return 0;

        int len = words.length;
        int[] letters=new int[len];

        for(int i=0;i<len;i++)
        {
            String word=words[i];
            for(int j=0;j<word.length();j++)
            {
                char ch=word.charAt(j);
                letters[i]=letters[i] | (1<<(ch-'a'));
            }
        }

        int ans=0;
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if((letters[i]&letters[j]) == 0)
                    ans=Math.max(ans,words[i].length()*words[j].length());
            }
        }

        return ans;
    }
}

//tc - O(n*m + n^2)
//sc - O(n)