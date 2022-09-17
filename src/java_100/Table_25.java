package java_100;

import java.util.Scanner;

public class Table_25 {
    public static void main(String[] args) {
        int a, b, c, d;
        System.out.println("Enter range of number to print their multiplication");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if(a<b) {
            for (c = a; c <= b; c++) {
                System.out.println("Multiplication table of " + c);
                for (d = 1; d <= 10; d++) {
                    System.out.println(c + "*" + d + " = " + (c * d));
                }
            }
        }
        else{
            for (c = b; c <= a; c++) {
                System.out.println("Multiplication table of " + c);
                for (d = 1; d <= 10; d++) {
                    System.out.println(c + "*" + d + " = " + (c * d));
                }
            }
        }
    }
}
