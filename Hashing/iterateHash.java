package Hashing;
import java.util.*;
public class iterateHash {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("Nandeesh");
        hs.add("nb");
        hs.add("NB");
        

        //using iterator() method
        Iterator<String> i=hs.iterator();
        //traversing
        while(i.hasNext()){
            System.out.println(i.next()+", ");
        }
        System.out.println();

        //using enhanced for loop or for each loop
        for(String e:hs){
            System.out.println(e+", ");
        }
    }
}
