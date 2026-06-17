class Node{
    int data;
    Node next;
    Node(int x){
        this.data=x;
        this.next=null;
    }
}
public class search_rec_LL {
    static boolean search(Node head, int key){
        //base case
        if(head==null) return false;
        if(head.data==key) return true;
        return search(head.next, key);
    }
    public static void main(String[] args) {
        Node head= new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        
        int x=(int)(Math.random()*100);
        System.out.println(x);
        System.out.println(search(head, x));
        
}
}
