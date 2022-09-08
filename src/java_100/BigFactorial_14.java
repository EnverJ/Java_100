package java_100;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial_14 {
    public static void main(String[] args) {
        int n, c;
        BigInteger inc = new BigInteger("1");
        BigInteger fact = new BigInteger("1");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer");
        n=sc.nextInt();
        for (c = 1; c <= n; c++) {
            fact = fact.multiply(inc);
            inc = inc.add(BigInteger.ONE);
        }
        System.out.println(n + "! = " + fact);
    }

}
