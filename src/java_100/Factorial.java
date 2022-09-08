package java_100;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        long n,c, fact=1;
        System.out.println("Enter an Integer to calculate it's factorial");
        Scanner sc=new Scanner(System.in);
        n=sc.nextLong();
        if(n<0){
            System.out.println("Number should be non-negative");

        }else{
            for ( c = 1 ; c <= n ; c++ )
                fact = fact*c;
            System.out.println("Factorial of "+n+" is = "+fact);
        }
    }

}
