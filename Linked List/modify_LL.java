class Node{
    int data;
    Node next;
    Node(int x){
        this.data=x;
        this.next=null;
    }
}
public class modify_LL {
    static Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        Node next=null;
        //traverse and reverse the linked list
        while(curr!=null){
            next=curr.next;
            //reverse the current nodes pointer
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    static Node modify(Node head){
        //return the head if single node
        if(head.next==null) return head;
        Node slow=head;
        Node fast= head;
        Node mid;
        // find the middle node
        while (fast.next!=null && fast.next.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        mid=slow;
        //Store the 2nd half of the list
        Node reveresedlist=mid.next;
        //spitting the list into two halves
        mid.next=null;
        // reverse the 2nd half
        reveresedlist=reverse(reveresedlist);
        Node curr1=head;
        Node curr2=reveresedlist;
        //iterating over both halves of the list and modifying the values
        while (curr2!=null) {
            int x=curr1.data;
            curr1.data=curr2.data-x;
            curr2.data=x;
            curr1=curr1.next;
            curr2=curr2.next;
        }
        //reverse the 2nd half and connect both halves
        mid.next=reverse(reveresedlist);
        return head;
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
        Node head= new Node(10);
        head.next=new Node(4);
        head.next.next=new Node(5);
        head.next.next.next=new Node(3);
        head.next.next.next.next=new Node(6);
        int x=10;
        printlist(head);
        head=modify(head);
        printlist(head);
    }
}
