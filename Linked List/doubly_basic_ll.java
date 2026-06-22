class Node{
    int data;
    Node prev;
    Node next;
    Node(int x){
        this.data=x;
        this.prev=null;
        this.next=null;
    }
}
public class doubly_basic_ll {
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.prev=head;
        head.next.next=new Node(30);
        head.next.next.prev=head.next;
        head.next.next.next=new Node(40);
        head.next.next.next.prev=head.next.next;
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data);
            if (temp.next!=null) {
                System.out.print("<->");
            }
            temp=temp.next;
        }
    }
}
