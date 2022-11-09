package java_100;

import java.util.HashMap;
import java.util.Map;

public class MapInterface_93 {
    public static void main(String[] args) {
        Map<Integer, String> map=new HashMap<>();
        map.put(100,"Java");
        map.put(101,"JavaScript");
        map.put(102,"Python");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" : "+m.getValue());
        }

    }
}
//        100 : Java
//        101 : JavaScript
//        102 : Python