package java_100;

import java.util.Scanner;

public class multipleCationTable_25 {
    public static void main(String[] args) {
        int n,c;
        System.out.println("Enter an integer to calculate its multiplication table:");
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        System.out.println("Multiplication table of "+n+" is :- ");
        for(c=1;c<10;c+=1){
            System.out.println(n+"*"+c+" = "+(n*c));

        }
    }
}
