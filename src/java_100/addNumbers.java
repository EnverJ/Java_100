package java_100;

import java.math.BigInteger;
import java.util.Scanner;

public class addNumbers {
    public static void main(String[] args) {
        int x, y, z;
        System.out.println("Enter two integers to calculate the sum");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        z=x+y;
        System.out.println("sum of x an dy is "+z);
        // add big numebrs
        String number1, number2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first large number"); number1 = in.nextLine();

        System.out.println("Enter second large number"); number2 = in.nextLine();
        BigInteger first = new BigInteger(number1); BigInteger second = new BigInteger(number2); BigInteger sum;
        sum = first.add(second); System.out.println("Result of addition = " + sum);

    }
}
