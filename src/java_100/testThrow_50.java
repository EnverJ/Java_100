package java_100;

public class testThrow_50 {

    static  void validate(int age)
    {
        if(age<18)
            throw new ArithmeticException("not valid");
        else
            System.out.println("Welcome to java_100");
    }

    public static void main(String[] args) {
        validate(15);
        System.out.println("rest of the code ..");
    }
}
