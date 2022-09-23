package java_100;

import java.util.Scanner;

public class PalinDrome_31 {
    public static void main(String[] args) {
        String original, reverse="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an string to check if it is a palindrome");
        original=sc.nextLine();
        int length=original.length();
        for(int i=length-1;i>=0;i--)
            reverse=reverse+original.charAt(i);
            if(original.equals(reverse))
                System.out.println("Entered string is an palindrome");
            else
                System.out.println("Entered string is not an palindrome");


    }
}
