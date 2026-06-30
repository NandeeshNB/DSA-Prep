package CircularLinked;
class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class delete_elementCCL {
    static Node deleteEle(Node last,int x){
        if(last==null){
            return null;
        }
        Node curr=last.next;
        Node prev=last;
        //if single node
        if (curr==last && curr.data==x) {
            return null;
        }
        //if node to delete is 1st node
        if(curr.data==x){
            last.next=curr.next;
            return last;
        }
        // traverse the list to find the node
        while (curr!=null && curr.data!=x) {
            prev=curr;
            curr=curr.next;
        }
        if(curr.data==x){
            prev.next=curr.next;
            if (curr==last) {
                last=prev;
            }
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
        last=deleteEle(last,3);
        printList(last);
    }
}
