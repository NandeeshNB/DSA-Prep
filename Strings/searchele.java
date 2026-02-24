import java.util.*;
public class searchele {
    static int search(String s,char c){
        int n=s.length();
        for(int iter=0;iter<n;iter++){
            if(s.charAt(iter)==c){
                return iter;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String sen="nandeesh";
        char c='k';
        System.out.println(search(sen,c));
    }
}
