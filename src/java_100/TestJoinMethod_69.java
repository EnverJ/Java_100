package java_100;

public class TestJoinMethod_69 extends  Thread {
    public void run(){
        for(int i=1;i<5;i++){
            try {
                Thread.sleep(500);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        TestJoinMethod_69 t1=new TestJoinMethod_69();
        TestJoinMethod_69 t2=new TestJoinMethod_69();
        TestJoinMethod_69 t3=new TestJoinMethod_69();
        t1.start();
        try {
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        t2.start();
        t3.start();
    }
}
