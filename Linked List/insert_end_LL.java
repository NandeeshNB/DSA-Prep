class Node{
    int data;
    Node next;
    Node(int x){
        this.data=x;
        this.next=null;
    }
}
public class insert_end_LL {
    static Node insertAtEnd(Node head, int x){
        Node newNode=new Node(x);
            if(head==null){
                newNode=head;
            }
            Node last=head;
            while(last.next!=null){
                last=last.next;
            }
            last.next=newNode;
            return head;
    }
    static void printlist(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            if (temp.next!=null) {
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
        int x=10;
        printlist(head);
        head=insertAtEnd(head, x);
        printlist(head);
    }
}

