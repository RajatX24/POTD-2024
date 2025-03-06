// Next Greater Node In Linked List
// https://leetcode.com/problems/next-greater-node-in-linked-list/description/?envType=problem-list-v2&envId=linked-list

// CODE 
class Solution {
    int findLen(ListNode head)
    {
        int len=0;
        while(head!=null)
        {
            len++;
            head=head.next;
        }
        return len;
    }
    public int[] nextLargerNodes(ListNode head) {
        int[] ans=new int[findLen(head)];
        Stack<int[]> stk=new Stack<>();

        int idx=0;

        while(head!=null)
        {
            while(!stk.isEmpty() && stk.peek()[0]<head.val)
            {
                ans[stk.pop()[1]]=head.val;
            }

            stk.push(new int[]{head.val,idx});
            
            head=head.next;
            idx++;
        }

        return ans;
    }
}

// T.C. - O(2N)
// S.C. - O(2N)