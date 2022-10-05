package java_100;

public class StaticVSinstance_45 {
    public static void main(String[] args) {
        display(); //calling without object


        StaticVSinstance_45 ss=new StaticVSinstance_45();
        ss.show();

    }

    static void display()
    {
        System.out.println("programming is wonderful");
    }
    void show()
    {
        System.out.println("Java is java");
    }
}
