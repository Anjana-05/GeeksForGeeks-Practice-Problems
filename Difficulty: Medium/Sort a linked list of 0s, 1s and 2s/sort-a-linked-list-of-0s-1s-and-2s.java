/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        int zeros = 0;
        int ones = 0;
        int twos= 0;
        
        Node temp = head;
        while(temp != null){
            if(temp.data == 0)
                zeros++;
            else if(temp.data == 1)
                ones++;
            else
                twos++;
            temp = temp.next;
        }
        
        temp = head;
        while(zeros-- > 0){
            temp.data = 0;
            temp = temp.next;
        }
        while(ones-- > 0){
            temp.data = 1;
            temp = temp.next;
        }
        while(twos-- > 0){
            temp.data = 2;
            temp = temp.next;
        }
        return head;
    }
}