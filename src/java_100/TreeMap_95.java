package java_100;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_95 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm=new TreeMap<>();
        tm.put(100,"AK");
        tm.put(101,"OK");
        tm.put(102,"TK");
        tm.put(103,"MK");

        for(Map.Entry m:tm.entrySet()){
            System.out.println(m.getKey()+" : "+m.getValue());

        }
    }
}
