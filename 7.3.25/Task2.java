// Linked List Group Reverse
// https://www.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

// CODE 
//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}

class ReverseInSize {
    static Node head;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(in.readLine().trim());

        while (t-- > 0) {

            String s[] = in.readLine().trim().split(" ");
            int a1 = Integer.parseInt(s[0]);
            Node head = new Node(a1);
            Node tail = head;
            for (int i = 1; i < s.length; i++) {
                int a = Integer.parseInt(s[i]);
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail = tail.next;
            }

            int k = Integer.parseInt(in.readLine().trim());
            Solution ob = new Solution();
            Node res = ob.reverseKGroup(head, k);
            printList(res, out);
            out.println();

            out.println("~");
        }
        out.close();
    }

    public static void printList(Node node, PrintWriter out) {
        while (node != null) {
            out.print(node.data + " ");
            node = node.next;
        }
    }
}

// } Driver Code Ends


/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    private static Node reverseLL(Node head)
    {
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
    
    public static Node reverseKGroup(Node head, int k) {
        // code here
        Node dummyHead=new Node(-1);
        Node prev=dummyHead;
        
        while(head!=null)
        {
            Node curr=head;
            int cnt=1;
            while(curr!=null && cnt<k)
            {
                curr=curr.next;
                cnt++;
            }
            
            Node next=curr==null?null:curr.next;
            if(curr!=null)
                curr.next=null;
                
            Node newHead=reverseLL(head);
            prev.next=newHead;
            prev=head;
            head=next;
        }
        
        return dummyHead.next;
    }
}

T.C. - O(N)
S.C. - O(1)