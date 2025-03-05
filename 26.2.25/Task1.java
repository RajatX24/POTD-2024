// Middle of a Linked List
// https://www.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

// CODE 
class Solution {
    int getMiddle(Node head) {
        // Your code here.
        Node slow=head;
        Node fast=head;
        
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        return slow.data;
    }
}

T.C. : O(n)
S.C. : O(1)