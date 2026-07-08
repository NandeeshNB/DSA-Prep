package Queue;
class myQueue{
    int[] arr;
    int capacity;
    int size;
    int front;
    public myQueue(int x){
        capacity=x;
        arr=new int[capacity];
        front=0;
        size=0;
    }

    public void enqueue(int x){
        if (size==capacity) {
            System.out.println("Queue is full");
            return;
        }
        int rear=(front+size)%capacity;
        arr[rear]=x;
        size++;
    }

    public void dequeue(){
        if (size==0) {
            System.out.println("queue is empty");
            return ;
        }
        int res=arr[front];
        front=(front+1)%capacity;
        size--;
        
    }

    public int getFront(){
        if (size==0) {
            return -1;
        }
        return arr[front];
    }

    public int getRear(){
        if (size==0) {
            return -1;
        }
        int rear=(front+size-1)%capacity;
        return arr[rear];
    }
}
public class queue_imp_arrCir {
    public static void main(String[] args) {
        myQueue q=new myQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.getFront()+" "+q.getRear());
        q.dequeue();
        System.out.println(q.getFront()+" "+q.getRear());
        q.enqueue(40);
        System.out.println(q.getFront()+" "+q.getRear());
    }
}
