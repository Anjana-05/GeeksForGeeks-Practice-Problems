/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node addOne(Node head) {
        Node curr = head;
        Node prev = null;
        
        while(curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        curr = prev;
        int carry = 1;
        while(curr != null){
            int sum = curr.data+carry;
            curr.data = sum % 10;
            carry = sum / 10;
            curr = curr.next;
        }
        curr = prev;
        prev = null;
        while(curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        if(carry > 0){
            Node start = new Node(carry);
            start.next = head;
            head = start;
        }
        return head;
    }
}