package LeetCode;

import java.util.HashSet;

public class longest_consecutive_128 {
    public static int longest(int[] nums){
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int l=0;
        for (int num : set) {
            if(!set.contains(num-1)){
                int currentnum=num;
                int length=1;
                while (set.contains(currentnum+1)) {
                    currentnum++;
                    length++;
                }
                l=Math.max(l, length);
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int[] arr={100,1,2,50,48,3,5,4,7};
        System.out.println(longest(arr));
    }
}
