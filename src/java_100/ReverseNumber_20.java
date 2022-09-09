package java_100;

import java.util.Scanner;

public class ReverseNumber_20 {
    public static void main(String[] args) {
        int x;
        int reverse=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number you want to reverse");
        x=sc.nextInt();
        while (x!=0){
            reverse=reverse*10;
            reverse=reverse+x%10;
            x=x/10;


        }
        System.out.println("the reversed number is "+reverse);
    }
}
