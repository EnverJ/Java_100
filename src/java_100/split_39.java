package java_100;

public class split_39 {
    public static void main(String[] args) {
        String s1="Java has string split method";
    //    String[] s=s1.split("\s");  // split string based on space
        String[] words=s1.split(" ");
        for(String w:words){
            System.out.println(w);
        }
    }
}
