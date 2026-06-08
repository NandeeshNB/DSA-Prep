class Node{
    int data;
    Node next;
    Node(int new_data){
        this.data=new_data;
        this.next=null;
    }
}

public class rec_traversal_LL {
    public static void traverse(Node head){
        //base condition
        if(head==null){
            System.out.println();
            return;
        }
        System.out.print(head.data);
        if (head.next!=null) {
            System.out.print("->");
        }
        //move to next node
        traverse(head.next);
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);

        traverse(head);
    }
}
