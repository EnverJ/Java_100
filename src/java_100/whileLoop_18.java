package java_100;

import java.util.Scanner;

public class whileLoop_18 {
    public static void main(String[] args) {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter an Enterger");
        while ((x=sc.nextInt())!=0){
            System.out.println("you entered "+x);
            System.out.println("Please Enter an Integer");
        }
        System.out.println("out of loop");
    }
}
