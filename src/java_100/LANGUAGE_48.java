package java_100;



public class LANGUAGE_48 {
    String name;
    LANGUAGE_48()
    {
        System.out.println("Constructor method called");
    }
    LANGUAGE_48(String t)
    {
        name=t;
    }

    public static void main(String[] args) {
        LANGUAGE_48 lan=new LANGUAGE_48();
        LANGUAGE_48 lanV=new LANGUAGE_48("Java");

        lan.setName("c#");
        lan.getName();

    }

    void setName(String t)
    {
        name=t;
    }
    void getName()
    {
        System.out.println("Language name: "+name);
    }
}
