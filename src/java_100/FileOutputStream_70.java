package java_100;


import java.io.FileOutputStream;

public class FileOutputStream_70 {
    public static void main(String[] args) {
        try {
            FileOutputStream fo=new FileOutputStream("src/java_100/textout.txt");
            fo.write(25);
            fo.close();
            System.out.println("success by java coding");

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
