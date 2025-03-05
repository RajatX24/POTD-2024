// Reverse a linked list
https://www.geeksforgeeks.org/problems/reverse-a-linked-list/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
// CODE 
class Solution {
    Node reverseList(Node head) {
        // code here
        Node prev=null;
        Node curr=head;
        Node next=null;
        
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        return prev;
    }
}