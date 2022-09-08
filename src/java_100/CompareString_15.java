package java_100;

import java.util.Scanner;

public class CompareString_15 {
    public static void main(String[] args) {
        String s1, s2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter first String:");
        s1=sc.nextLine();
        System.out.println("Please enter second String: ");
        s2=sc.nextLine();
        if(s1.compareTo(s2)>0){
            System.out.println(s1+" is greater than "+s2);

        } else if (s1.compareTo(s2)<0) {
            System.out.println(s1+" is less than "+s2);
        }
        else{
            System.out.println(s1+" and "+ s2+" are same");
        }
    }
}
