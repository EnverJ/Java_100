package java_100;

import java.util.Scanner;

public class swapNumbers_6 {
    public static void main(String[] args) {
        int x, y, temp;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("Before swapping\nx = " +x+" \ny = "+y);
        temp=x;
        x=y;
        y=temp;
        System.out.println("After swapping\nx = " +x+" \ny = "+y);
    }
}
