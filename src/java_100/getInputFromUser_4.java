package java_100;

import java.util.Scanner;

public class getInputFromUser_4 {
    public static void main(String[] args) {
        int a;
        float b;
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        s=sc.nextLine();
        System.out.println("You entered String "+s);
        System.out.println("Enter float");
        b=sc.nextFloat();
        System.out.println("You entered float "+b);
        System.out.println("Enter an integer");
        a=sc.nextInt();
        System.out.println("you entered integer "+a);


    }


}
