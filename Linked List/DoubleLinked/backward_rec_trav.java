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
public class backward_rec_trav {
    static void backwardTraversal(Node tail){
        if (tail==null) {
            return;
        }
        System.out.print(tail.data+" ");
        backwardTraversal(tail.prev);
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        head.next=second;
        second.prev=head;
        second.next=third;
        third.prev=second;
        System.out.println("Backward Traversal");
        // put tail that is (third) in place of head
        backwardTraversal(third);
    }
}
