package java_100;

import java.io.IOException;

public class NotePad_59 {
    public static void main(String[] args) {
        Runtime rs=Runtime.getRuntime();
        try {
            rs.exec("notePad");
        } catch (IOException e) {
         //   throw new RuntimeException(e);
            System.out.println(e);
        }
    }
}
