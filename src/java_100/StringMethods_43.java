package java_100;

public class StringMethods_43 {
    public static void main(String[] args) {
        int n;
        String s = "Java programming", t = "", u = "";
        System.out.println(s);
        n = s.length();
        System.out.println("number of character =" + n);

        t = s.replace("Java", "c++");
        System.out.println(s);
        System.out.println(t);

        // concatenating string with another string
        u=s.concat(" is fun");
        System.out.println(s);
        System.out.println(u);



    }
}