package java_100;

interface interface_52 {
    static final String language="Java";
    public  void display();

}

class Simple implements  interface_52
{
    public static void main(String[] args) {
        Simple obj=new Simple();
        obj.display();
    }

    @Override
    public void display() {
        System.out.println(language+" is awesome!!!");

    }
}
