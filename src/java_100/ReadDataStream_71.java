package java_100;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadDataStream_71 {
    public static void main(String[] args) {
        try {
            FileInputStream fi=new FileInputStream("src/java_100/textout.txt");

            int i=fi.read();
            System.out.println((char) i);
            fi.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
