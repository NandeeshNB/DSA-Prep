package LeetCode;

import java.util.*;

public class group_anagram_49 {
    public static List<List<String>> groupAnagram(String[] strs){
        HashMap<String,List<String>> map=new HashMap<>();
        for (String str : strs) {
            //convert String to characters
            char[] c=str.toCharArray();
            // sort the characters
            Arrays.sort(c);
            //convert back to string
            String key=new String(c);
            //create list if key already dosent exist
            map.putIfAbsent(key, new ArrayList<>());
            //add current word to the list of that particular key
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String[] arr={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagram(arr));
    }
}
