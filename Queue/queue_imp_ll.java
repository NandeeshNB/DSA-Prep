package Queue;
class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}

class mQueue{
    Node front;
    Node rear;
    int size;
    public mQueue(){
        front=rear=null;
        size=0;
    }

    public boolean isEmpty(){
        return front==null;
    }

    public void enqueue(int x){
        Node newNode=new Node(x);
        if (isEmpty()) {
            front=rear=newNode;            
        }else{
            rear.next=newNode;
            rear=newNode;
        }
        size++;
    }

    public int dequeue(){
        if (isEmpty()) {
            System.out.println("Queue Empty");
            return -1;            
        }
        Node temp=front;
        int removed=temp.data;
        front=front.next;
        if (front==null) {
            rear=null;
        }
        size--;
        return removed;
    }

    public int getFront(){
        if (isEmpty()) {
            System.out.println("Queue Empty");
            return -1;            
        }
        return front.data;
    }

    public int size(){
        return size;
    }
}
public class queue_imp_ll {
    public static void main(String[] args) {
        mQueue q=new mQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println("Dequeue : "+q.dequeue());
        q.enqueue(40);
        System.out.println("Front : "+q.getFront());
        System.out.println("Size : "+q.size());
    }
}
