package java_100;

public class MultiThreadingRun_68 extends Thread{
    public  void run(){
        System.out.println("thread is running");
    }

    public static void main(String[] args) {
        MultiThreadingRun_68 t1=new MultiThreadingRun_68();
        t1.start();

    }
}
