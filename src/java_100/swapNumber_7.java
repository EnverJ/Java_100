package java_100;

import java.util.Scanner;

public class swapNumber_7 {
    public static void main(String[] args) {
        int x, y;
        System.out.println("Enter x and y");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After Swapping\nx = "+x+"\ny = "+y);
    }
}
