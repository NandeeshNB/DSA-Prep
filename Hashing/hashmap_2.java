package Hashing;
import java.util.*;

public class hashmap_2 {
    public static void main(String args[]){
        HashMap<String,Integer> hm=new HashMap<>();

        //add elements using .put()
        hm.put("John",25);
        hm.put("jane",28);
        hm.put("Ranga",30);
        hm.put("Bunty",35);

        //access element using .get()
        System.out.println("Age of Ranga : "+hm.get("Ranga"));

        //change values
        hm.put("Ranga", 56);
        System.out.println("Updated Map  : "+hm);

        //remove element using .remove()
        hm.remove("jane");
        System.out.println("Updated Map after removal : "+hm);

        //iteration
        for(Map.Entry<String,Integer> e: hm.entrySet()){
            System.out.println("Key : "+e.getKey()+", Value :"+e.getValue());
        }
    }
}
