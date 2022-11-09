package java_100;

import java.util.Hashtable;
import java.util.Map;

public class HashTable_96 {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht=new Hashtable<>();
        ht.put(1,"Java Basic");
        ht.put(1,"Java Mid");
        ht.put(1,"Java Advance");
        ht.put(1,"Java Advance 2");

        for(Map.Entry m:ht.entrySet()){
            System.out.println(m.getKey()+"--"+m.getValue());
        }

// output:  ht.put(1,"Java Advance");
    }
}
