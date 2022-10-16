package java_100;

import java.util.Scanner;

public class LinearSearch_60 {
    public static void main(String[] args) {
        int c, n, Search, array[];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        n=sc.nextInt();
        array=new int[n];
        System.out.println("Enter "+ n +" integers");

        for(c=0;c<n;c++)
            array[c]=sc.nextInt();
        System.out.println("Enter value to find");
        Search=sc.nextInt();
        for(c=0;c<n;c++)
        {
           if(array[c]==Search)
           {
               System.out.println(Search + " is present at location "+ (c+1)+".");
               break;
           }
        }
        if(c==n)
            System.out.println(Search+ " is not present in array");
    }
}
