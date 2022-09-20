package java_100;

import java.util.Scanner;

public class SubStringOfAString_29 {
    public static void main(String[] args) {
        String string,sub;
        int i,c,length;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to print it's all substring");
        string=sc.nextLine();
        length=string.length();
        System.out.println("Substring of \""+string+"\" are:-");
        for(c=0;c<length;c++){
            for(i=0;i<=length-c;i++){
                sub=string.substring(c,c+1);
                System.out.println(sub);
            }
        }
    }
}
