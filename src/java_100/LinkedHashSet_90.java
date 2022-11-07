package java_100;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_90 {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("DC");
        lhs.add("CA");
        lhs.add("OK");

        Iterator it=lhs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
