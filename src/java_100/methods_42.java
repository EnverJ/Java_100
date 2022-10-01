package java_100;

public class methods_42 {
    // constructor Method
    methods_42()
    {
        System.out.println("Constructor method is called when an object of it's class created");
    }

    public static void main(String[] args) {
        staticMethod();
        methods_42 object=new methods_42();
        object.nonStaticMethod();

    }

    // static method
    static void staticMethod()
    {
        System.out.println("Static method can be called without creating object");
    }
    //non-static method
    void nonStaticMethod()
    {
        System.out.println("Non static method must be called by creating an object");
    }
}
