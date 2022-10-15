package java_100;

import java.util.Random;

public class RandomNumbers_56 {
    public static void main(String[] args) {
        int i;
        Random rand=new Random();
        for (i=1;i<10;i++)
        {
            System.out.println(rand.nextInt(100));
        }
    }
}
