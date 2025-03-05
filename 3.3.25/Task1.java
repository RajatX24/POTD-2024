// Stack using Linked List
// https://www.geeksforgeeks.org/problems/implement-stack-using-linked-list/1

// CODE 
class MyStack {
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }
    StackNode top;

    // Function to push an integer into the stack.
    void push(int a) {
        // Add your code here
        StackNode newNode=new StackNode(a);
        if(top==null)
            top=newNode;
        else
        {
            newNode.next=top;
            top=newNode;
        }
    }

    // Function to remove an item from top of the stack.
    int pop() {
        // Add your code here
        if(top!=null)
        {
            int val=top.data;
            top=top.next;
            return val;
        }
        return -1;
    }
}