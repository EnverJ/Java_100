package java_100;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListInterface_88 {
    int id;
    String name, author, publisher;
    int quantity;
    public  ArrayListInterface_88(int id, String name, String author,String publisher,int quantity){
        this.id= id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

class ListInterfaceEx{
    public static void main(String[] args) {
        List<ArrayListInterface_88> list= new ArrayList();
        ArrayListInterface_88 b1=new ArrayListInterface_88(100,"math","Ezmet","Mars",1000);
        ArrayListInterface_88 b2=new ArrayListInterface_88(101,"English","Ezmet","Mars",2000);
        ArrayListInterface_88 b3=new ArrayListInterface_88(102,"Politics","Ezmet","Mars",500);

        list.add(b1);
        list.add(b2);
        list.add(b3);
        System.out.println("original content of the list is ");

        for(ArrayListInterface_88 b:list){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);

        }
        ListIterator<ArrayListInterface_88> itr=list.listIterator();
        while(itr.hasNext()){
            ArrayListInterface_88 st=(ArrayListInterface_88) itr.next();
            System.out.println(st.quantity+ " "+st.publisher+" "+st.author+" "+st.name+" "+st.id );
        }
    }

}