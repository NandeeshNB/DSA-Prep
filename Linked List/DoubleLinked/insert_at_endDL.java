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
public class insert_at_endDL {
    public static Node insertAtEnd(Node head, int x){
        Node newNode=new Node(x);
        if(head==null){
            head=newNode;
        } else{
            Node curr=head;
            while (curr.next!=null) {
                curr=curr.next;
            }
            curr.next=newNode;
            newNode.prev=curr;
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
        head.next.next=new Node(3);
        head.next.next.prev=head.next;
        printList(head);
        int x=4;
        head=insertAtEnd(head,x);
        printList(head);
    }
}
