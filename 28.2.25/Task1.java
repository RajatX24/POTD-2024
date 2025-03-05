// Delete without head pointer
// https://www.geeksforgeeks.org/problems/delete-without-head-pointer/1
// CODE 
class Solution {
    void deleteNode(Node node) {
        // Your code here
        Node prev=node;
        while(node.next!=null)
        {
            node.data=node.next.data;
            prev=node;
            node=node.next;
        }
        
        prev.next=null;
    }
}

// T.C : O(n)
// S.C : O(1)