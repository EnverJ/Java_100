package java_100;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression_67 {
    public static void main(String[] args) {
        // 1st way
        Pattern p=Pattern.compile(".s"); // represent single character
        Matcher m=p.matcher("as");
        boolean b=m.matches();

        Pattern p1=Pattern.compile(".s",Pattern.CASE_INSENSITIVE); // represent single character
        Matcher m1=p.matcher("no no no as");
        boolean b5=m1.find();

        // 2nd way
        boolean b2=Pattern.compile(".s").matcher("as").matches();
        //3rd way
        boolean b3=Pattern.matches(".s","as");
        System.out.println(b+" "+b5+" "+b2+" "+b3);
    }
}
