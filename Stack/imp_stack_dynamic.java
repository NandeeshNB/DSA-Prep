package Stack;

import java.util.ArrayList;

class mStack{
    ArrayList<Integer> arr=new ArrayList<>();

    void push(int x){
        arr.add(x);
    }
     
    int pop(){
        if (arr.isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int val=arr.get(arr.size()-1);
        arr.remove(arr.size()-1);
        return val;
    }

    int peek(){
        if (arr.isEmpty()) {
            System.out.println("Stack Empty");
            return -1;
        }
        return arr.get(arr.size()-1);
    }

    boolean isEmpty(){
        return arr.isEmpty();
    }

    int size(){
        return arr.size();
    }
    
}
public class imp_stack_dynamic {
    public static void main(String[] args) {
        mStack st=new mStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        
        System.out.println("Popped : "+st.pop());
        System.out.println("Popped : "+st.pop());
        System.out.println("Popped : "+st.pop());
        System.out.println("Top element : "+st.peek());
        System.out.println("Is stack empty : "+(st.isEmpty()?"Yes":"No"));
        System.out.println("Stack Size : "+st.size());
    }
}
