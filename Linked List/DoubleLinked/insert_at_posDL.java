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
public class insert_at_posDL {
    public static Node insertAtPos(Node head,int pos, int x){
        Node newNode=new Node(x);
        if (pos==1) {
            newNode.next=head;
            if (head!=null) {
                head.prev=newNode;
            }
            head=newNode;
            return head;
        }
        Node curr=head;
        // traverse before insertion point
        for (int i = 1;i<pos-1 && curr!=null ; ++i) {
            curr=curr.next;
        }
        //if pos out of bounds
        if (curr==null) {
            return head;
        }
        newNode.prev=curr;
        newNode.next=curr.next;
        curr.next=newNode;
        if (newNode.next!=null) {
            newNode.next.prev=newNode;
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
        int x=3;
        int pos=3;
        head=insertAtPos(head,pos,x);
        printList(head);
    }
}
