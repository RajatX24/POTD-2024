// Permutations
// https://leetcode.com/problems/permutations/description/

// CODE

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Integer[] permutation=new Integer[nums.length];
        boolean[] taken=new boolean[nums.length];
        helper(ans,permutation,taken,nums,0);
        return ans;
    }

    void helper(List<List<Integer>> ans,Integer[] permutation,boolean[] taken,int[] nums,int currIdx)
    {
        if(currIdx==nums.length)
        {
            ans.add(new ArrayList<Integer>(Arrays.asList(permutation)));
            return;
        }

        for(int i=0;i<nums.length;i++)
        {
            if(!taken[i])
            {
                taken[i]=true;
                permutation[currIdx]=nums[i];
                helper(ans,permutation,taken,nums,currIdx+1);
                taken[i]=false;
            }
        }
    }
}

// T.C. -  n! * n
// S.C. - n