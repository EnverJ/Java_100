package java_100;

public class computer_46 {
    computer_46()
    {
        System.out.println("Constructor of Computer Class");
    }
    void COMPUTER_METHOD()
    {
        System.out.println("Computer is fast");
    }

    public static void main(String[] args) {
        computer_46 cn=new computer_46();
        laptop lt=new laptop();
        cn.COMPUTER_METHOD();
        lt.laptop_method();
    }

}

class laptop{
    laptop()
    {
        System.out.println("constructor of laptop class");
    }
    void laptop_method()
    {
        System.out.println("I use laptop");
    }
}
