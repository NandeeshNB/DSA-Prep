class Node{
    int data;
    Node next;
    Node(int x){
        this.data=x;
        this.next=null;
    }
}
public class modify_rec_LL {
    static Node reverse(Node head){
        if (head==null || head.next==null) {
            return head;
        }
        // reverse the list and put the 1st element at the last
        Node rest=reverse(head.next);
        //make the current head as the last node of the remaining list
        head.next.next=head;
        //update head of current to null
        head.next=null;
        return rest;
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
