package java_100;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_87 {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<>();
        ll.add("Jon");
        ll.add("Luna");
        ll.add("Nero");
        ll.add("Dodge");


        Iterator<String> it=ll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
