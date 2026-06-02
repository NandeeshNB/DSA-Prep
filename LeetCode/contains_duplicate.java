package LeetCode;

import java.util.HashSet;

public class contains_duplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,1};
        System.out.println(containsDuplicate(arr));
    }
}
