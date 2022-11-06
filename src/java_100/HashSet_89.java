package java_100;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_89 {
    public static void main(String[] args) {
        // Creating HashSet and adding elements
        HashSet<String> hs =new HashSet<>();
        hs.add("John");
        hs.add("Trump");
        hs.add("Pompeo");
        hs.add("Bosh");
        Iterator<String> it=hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
