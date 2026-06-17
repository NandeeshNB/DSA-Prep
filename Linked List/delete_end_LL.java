class Node{
    int data;
    Node next;
    Node(int x){
        this.data=x;
        this.next=null;
    }
}
public class delete_end_LL {
    static Node deleteEnd(Node head){
        if(head==null)
            return null;
        if(head.next==null) return null;
        Node secondLast=head;
        while (secondLast.next.next!=null) {
            secondLast=secondLast.next;
        }
        secondLast.next=null;
        return head;
    }
    static void printlist(Node head){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data);
            if(temp.next!=null){
                System.out.print("->");
            }
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head= new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        printlist(head);
        head=deleteEnd(head);
        printlist(head);
}
}
