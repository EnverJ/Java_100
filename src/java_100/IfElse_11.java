package java_100;

import java.util.Scanner;

public class IfElse_11 {
    public static void main(String[] args) {
        int obtained;
        int PassingMarks = 60;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter your Score:");
        obtained=sc.nextInt();
        if(obtained>=PassingMarks){
            System.out.println("You passed the test");

        }    
        else{
            System.out.println("You failed.");
        }
    }
}
