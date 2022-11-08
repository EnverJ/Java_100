package java_100;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue_92 {
    public static void main(String[] args) {
        PriorityQueue<String> pq=new PriorityQueue<String>();
        pq.add("AB1");
        pq.add("AB2");
        pq.add("AB3");
        pq.add("AB4");
        pq.add("AB5");

        System.out.println("head "+pq.element());
        System.out.println("head "+pq.peek());
        System.out.println("Iterating the queue element");

        Iterator<String> it=pq.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        pq.remove();
        pq.poll();
        System.out.println("After removing two elements");
        Iterator<String> it2=pq.iterator();
        while(it.hasNext()){
            System.out.println(it2.next());
        }



    }
}

//    The Java.util.PriorityQueue.iterator() method is used to return an iterator of the same elements as the Priority Queue. The elements are returned in random order from what present in the Queue.
//
//        Syntax:
//
//        Iterator iterate_value = Priority_Queue.iterator();
//        Parameters: The function does not take any parameter.
//
//        Return Value: The method iterates over the elements of the queue and returns the values(iterators).

