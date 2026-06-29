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
public class delete_at_frontDL {
    public static Node deleteHead(Node head){
        if (head==null) {
            return null;
        }
        Node temp=head;
        head=head.next;
        if (head!=null) {
            head.prev=null;
        }
        return head;
    }
    public static void printList(Node head){
        Node curr=head;
        while (curr!=null) {
            System.out.print(curr.data);
            if(curr.next!=null){
                System.out.print("<->");
            }
            curr=curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.prev=head;
        head.next.next=new Node(4);
        head.next.next.prev=head.next;
        printList(head);
        head=deleteHead(head);
        printList(head);
    }
}
