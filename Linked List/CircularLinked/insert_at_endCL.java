package CircularLinked;
class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class insert_at_endCL {
    static Node insertEnd(Node last,int x){
        Node newNode=new Node(x);
        if(last==null){
            last=newNode;
            newNode.next=newNode;
        }else{
            newNode.next=last.next;
            last.next=newNode;
            last=newNode;
        }
        
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
        last=insertEnd(last, 5);
        printList(last);
    }
}
