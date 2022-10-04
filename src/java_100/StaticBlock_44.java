package java_100;

public class StaticBlock_44 {
//    public static void main(String[] args)
//    {
//        System.out.println("Main methods is executed");
//    }
//    static
//    {
//        System.out.println("Static block is executed before main mathod");
//    }


    //2. Static block Application: we need to open a program in specific window

    public static void main(String[] args)
    {
        System.out.println("I am using mac");
    }
    static
    {
        String os=System.getenv("OS");
        if(os.equals("mac")!=true)
        {
            System.exit(1);
        }
    }
}

