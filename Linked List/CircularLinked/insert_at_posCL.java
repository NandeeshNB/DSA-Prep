package CircularLinked;
class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class insert_at_posCL {
    static Node insertPos(Node last,int pos,int x){
        
        if(last==null){
            if (pos!=1) {
                System.out.println("invalid");
                return last;
            }
            Node newNode=new Node(x);
            last=newNode;
            last.next=last;
            return last;
        }
        Node newNode=new Node(x);
        Node curr=last.next;
        if(pos==1){
            newNode.next=curr;
            last.next=newNode;
            return last;
        }
        for (int i = 1; i < pos-1; ++i) {
            curr=curr.next;
            if(curr==last){
                System.out.println("invalid");
                return last;
            }
        }
        newNode.next=curr.next;
        curr.next=newNode;
        if (curr==last) {
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
        last=insertPos(last,3, 5);
        printList(last);
    }
}
