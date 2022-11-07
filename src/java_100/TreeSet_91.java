package java_100;


import java.util.*;
//The Java.util.TreeSet.add() method in Java TreeSet is used to add a specific element into a TreeSet.
//        The function adds the element only if the specified element is not already present in the set
//        else the function return False if the element is not present in the TreeSet.

public class TreeSet_91 {
    public static void main(String[] args) {
        TreeSet<String> al=new TreeSet<String>();
        al.add("MD");
        al.add("AO");
        al.add("MD");
        al.add("BD");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
    }

}}




