package Hashing;
import java.util.*;
public class hashmap_1 {
    public static void main(String args[]){

        HashMap<String, Integer> hm=new HashMap<>();

        hm.put("jan",25 );
        hm.put("jim",30);
        hm.put("ran",45);

        //Iteration
        for(Map.Entry<String, Integer> entry:hm.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }

        System.out.println("Mappings : "+hm);

    }
}
