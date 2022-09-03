package java_100;

import java.util.Scanner;

public class LargestOfThreeNumbers_9 {
    public static void main(String[] args) {
        int x, y,z;
        System.out.println("Enter three integers");
        Scanner sc=new Scanner(System.in);
        x= sc.nextInt();
        y= sc.nextInt();
        z=sc.nextInt();
        if(x>y&&x>z){
            System.out.println(x+" is the largest.");
        }
        else if (y>x&&y>z) {
            System.out.println(y+" is the largest");

        } else if (z>x&&z>y) {
            System.out.println(z+"v is the largest number");

        }else{
            System.out.println("numbers are same");
        }
    }
}
