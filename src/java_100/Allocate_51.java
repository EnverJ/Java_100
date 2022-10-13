package java_100;

public class Allocate_51 {
    // advantage of finally in exception handling in java program
    public static void main(String[] args) {
        try {
            long data[] = new long[1000000000];
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("finally block will always be executed.");
        }
    }



}