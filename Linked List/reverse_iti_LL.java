class Node{
    int data;
    Node next;
    Node(int x){
        this.data=x;
        this.next=null;
    }
}
public class reverse_iti_LL {
    static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            //reverse the curr position
            curr.next=prev;
            // move pointer to one postion ahead
            prev=curr;
            curr=next;
        }
        return prev;
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
        head=reverse(head);
        printlist(head);
}
}