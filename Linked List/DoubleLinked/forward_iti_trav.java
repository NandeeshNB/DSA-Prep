package DoubleLinked;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int x){
        this.data=x;
        this.next=this.prev=null;
    }
}
public class forward_iti_trav {
    static void forwardTraversal(Node head){
        Node curr=head;
        while (curr!=null) {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        head.next=second;
        second.prev=head;
        second.next=third;
        third.prev=second;
        System.out.println("Forward Traversal");
        forwardTraversal(head);
    }
}
