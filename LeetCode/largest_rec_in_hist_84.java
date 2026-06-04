package LeetCode;

import java.util.Stack;

public class largest_rec_in_hist_84 {
    public static int largestRectangleArea(int[] heights){
        Stack<Integer> st=new Stack<>();
        int length=heights.length;
        int area=0;


        for(int i=0;i<length;i++){
            while(!st.empty()&&heights[i]<heights[st.peek()]){
                int bar=st.pop();
                int pse =st.empty()?-1:st.peek();
                int nse=i;
                area=Math.max(area, heights[bar]*(nse-pse-1));
            }
            st.push(i);
            
        }
        while(!st.empty()){
            int bar = st.pop();
            int pse = st.empty() ? -1 : st.peek();
            int nse = length;
            area = Math.max(area, heights[bar] * (nse - pse - 1));
        }
        return area;
    }
    public static void main(String[] args) {
        int[] arr={2,1,5,6,2,3};
        System.out.println(largestRectangleArea(arr));
    }
}
