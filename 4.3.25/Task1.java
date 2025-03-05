// Detect Loop in linked list
// https://www.geeksforgeeks.org/problems/detect-loop-in-linked-list/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

// CODE
class Solution {
    public static boolean detectLoop(Node head) {
        Node slow = head;
        Node fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                return true;
            }
        }
        
        return false;
    }
}

// T.C. : O(n)
// S.C. : O(1)