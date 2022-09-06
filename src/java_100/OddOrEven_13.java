package java_100;

import java.util.Scanner;

public class OddOrEven_13 {
    public static void main(String[] args) {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the Integer");
        x=sc.nextInt();
        if(x%2==0){
            System.out.println(x+" is even number");

        }else
            System.out.println(x+" is odd number");

    }


}
