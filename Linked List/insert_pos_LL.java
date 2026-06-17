class Node{
    int data;
    Node next;
    Node(int x){
        this.data=x;
        this.next=null;
    }
}
public class insert_pos_LL {
    static Node insertpos(Node head,int pos,int val){
        Node newNode=new Node(val);
        if(pos<1){
            return head;
        }
        
        if(pos==1){
            newNode.next=head;
            return newNode;
        }
        Node curr=head;
        //traverse till pos-1
        for(int i=1;i<pos-1 && curr!=null;i++){
             curr=curr.next;
        }
        if(curr==null){
            return head;
        }
        newNode.next=curr.next;
        curr.next=newNode;
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
        Node head= new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        int x=10;
        int p=3;
        printlist(head);
        head=insertpos(head,p, x);
        printlist(head);
}
}
