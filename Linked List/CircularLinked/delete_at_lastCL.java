package CircularLinked;
class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class delete_at_lastCL {
    static Node deleteEnd(Node last){
        if (last==null) {
            System.out.println("Emprty List");
            return null;
        }
        Node head=last.next;
        if (head==last) {
            last=null;
            return last;
        }
        Node curr=head;
        while (curr.next!=last) {
            curr=curr.next;
        }
        curr.next=head;
        curr=head;
        return last;
    }
    static void printList(Node last){
        if(last==null) return;
        Node head=last.next;
        Node temp=head;
        do{
            System.out.print(temp.data);
            temp=temp.next;
            if(temp!=head) System.out.print("->");
        }while(temp!=head);
        System.out.println();
    }
    public static void main(String[] args) {
        Node first=new Node(2);
        first.next=new Node(3);
        first.next.next=new Node(4);
        Node last=first.next.next;
        last.next=first;
        printList(last);
        last=deleteEnd(last);
        printList(last);
    }
}
