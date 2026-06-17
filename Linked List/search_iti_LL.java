class Node{
    int data;
    Node next;
    Node(int x){
        this.data=x;
        this.next=null;
    }
}
public class search_iti_LL {
    static boolean search(Node head, int key){
        Node curr=head;
        while (curr!=null) {
            if (curr.data==key) {
                return true;
            }
            curr=curr.next;
        }
        return false;
    }
    public static void main(String[] args) {
        Node head= new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        
        int x=3;
        System.out.println(search(head, x));
        
}
}
