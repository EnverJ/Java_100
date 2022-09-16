package java_100;

import java.util.Scanner;

public class BreakContinueWhileLoop_22{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("Enter an integer");
            n=sc.nextInt();
            if(n !=0){
                System.out.println("You entered "+n);
                continue;
            }
            else {
                break;
            }
        }

    }
}
