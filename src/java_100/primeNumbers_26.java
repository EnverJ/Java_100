package java_100;

import java.util.Scanner;

public class primeNumbers_26 {

    // this is nor correct. just for coding purpose
    public static void main(String[] args) {
        int a, status = 1, num = 3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of prime numbers you want");
        a = sc.nextInt();
        if (a >= 1) {
            System.out.println("First " + a + " prime numbers are :-");
            System.out.println(2);
        }
        for (int count = 2; count <= a; ) {
            for (int j = 2; j <= Math.sqrt(num); j++) {

                if (num % j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                System.out.println(num);
                count++;

                status = 1;
                num++;
            }
        }

    }
}
