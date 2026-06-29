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
public class delete_at_posDl {
    public static Node deletePos(Node head,int pos){
        if (head==null) {
            return head;
        }
        
        Node curr=head;
        for(int i=1;i<pos && curr!=null;i++){
            curr=curr.next;
        }
        if (curr==null) {
            return head;
        }
        if (curr.prev!=null) {
            curr.prev.next=curr.next;
        }
        if (curr.next!=null) {
            curr.next.prev=curr.prev;
        }
        if (head==curr) {
            head=curr.next;
        }
        curr=null;
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
        head=deletePos(head,3);
        printList(head);
    }
}
