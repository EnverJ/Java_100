package java_100;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHshMap_94 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm=new LinkedHashMap<>();
        lhm.put(100,"Java");
        lhm.put(101,"JavaScript");
        lhm.put(102,"JavaDoc");
        lhm.put(103,"JavaC");
        for(Map.Entry m:lhm.entrySet()){
            System.out.println(m.getKey()+" : "+m.getValue());

        }


    }
}
