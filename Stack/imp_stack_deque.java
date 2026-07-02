package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class imp_stack_deque {
    public static void main(String[] args) {
        Deque<Integer> st=new ArrayDeque<>();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.pop()+" is Popped");
        System.out.println("Top Element : "+st.peek());
    }
}
