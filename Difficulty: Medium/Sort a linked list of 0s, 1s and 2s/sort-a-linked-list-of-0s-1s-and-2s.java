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
        Node zeroHead = new Node(-1);
        Node onesHead = new Node(-1);
        Node twosHead = new Node(-1);
        
        Node zeroTail = zeroHead;
        Node onesTail = onesHead;
        Node twosTail = twosHead;
        
        Node temp = head;
        
        while(temp != null){
            if(temp.data == 0){
                zeroTail.next = temp;
                zeroTail = zeroTail.next;
            } 
            else if(temp.data == 1){
                onesTail.next = temp;
                onesTail = onesTail.next;
            } 
            else{
                twosTail.next = temp;
                twosTail = twosTail.next;
            } 
            temp = temp.next;
        }
        
        zeroTail.next = (onesHead.next != null) ? onesHead.next : twosHead.next;
        onesTail.next = (twosHead.next != null) ? twosHead.next : null;
        twosTail.next = null;
        
        head = zeroHead.next;
        return head;
        
    }
}