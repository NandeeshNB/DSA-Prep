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
public class insert_at_frontDL {
    public static Node insertAtFront(Node head, int x){
        Node newNode=new Node(x);
        //make next of newNode as head
        newNode.next=head;
        //make prev of head as newNOde
        if(head!=null){
            head.prev=newNode;
        }
        //return newNide as head
        return newNode;
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
        Node head=new Node(2);
        head.next=new Node(3);
        head.next.prev=head;
        head.next.next=new Node(4);
        head.next.next.prev=head.next;
        printList(head);
        int x=1;
        head=insertAtFront(head,x);
        printList(head);
    }
}
