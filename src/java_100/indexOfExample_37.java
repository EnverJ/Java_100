package java_100;

public class indexOfExample_37 {
    public static void main(String[] args) {
        String s1="This is java 100 days challenge";
        // passing substring
        int index1=s1.indexOf("is");
        int index2=s1.indexOf("days");
        System.out.println(index1+" "+index2);

        // passing substring with from index
        int index3=s1.indexOf("is");
        System.out.println(index3);

        // passing char value
        int index4=s1.indexOf("s");
        System.out.println(index4);

    }
}
