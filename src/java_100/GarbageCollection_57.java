package java_100;

public class GarbageCollection_57 {

    public static void main(String[] args) {
        Runtime rt=Runtime.getRuntime();
        System.out.println("Free memory in JVM before Garbage collection ="+rt.freeMemory());
        rt.gc();

        System.out.println("Free memory in jVM after Garbage Collection ="+rt.freeMemory());
    }
}
