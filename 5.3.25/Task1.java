// Add Two Numbers
// https://leetcode.com/problems/add-two-numbers/description/?envType=problem-list-v2&envId=linked-list

// Code
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead=new ListNode(-1);
        ListNode prev=dummyHead;
        int carry=0;

        while(l1!=null && l2!=null)
        {
            int sum=l1.val+l2.val+carry;
            ListNode newNode=new ListNode(sum%10);
            prev.next=newNode;
            prev=newNode;
            carry=sum/10;

            l1=l1.next;
            l2=l2.next;

        }

        while(l1!=null)
        {
            int sum=l1.val+carry;
            ListNode newNode=new ListNode(sum%10);
            prev.next=newNode;
            prev=newNode;
            carry=sum/10;

            l1=l1.next;
        }

        while(l2!=null)
        {
            int sum=l2.val+carry;
            ListNode newNode=new ListNode(sum%10);
            prev.next=newNode;
            prev=newNode;
            carry=sum/10;

            l2=l2.next;
        }

        while(carry!=0)
        {
            int sum=carry;
            ListNode newNode=new ListNode(sum%10);
            prev.next=newNode;
            prev=newNode;
            carry=sum/10;
        }

        return dummyHead.next;
    }
}

// T.C. : O(max(n1,n2)) where n1 and n2 are length of l1,l2
// S.C. : O(max(n1,n2))