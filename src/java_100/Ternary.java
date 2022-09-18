package java_100;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        int a;
        System.out.println("Please enter an integer");
        while(true) {
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            System.out.println((a > 100 ? true : false));

        }

    }
}
