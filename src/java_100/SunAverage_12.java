package java_100;

public class SunAverage_12 {
    static void sum_Average(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        int ave = sum / a.length;
        System.out.println("sum of array is " + sum);
        System.out.println("Average of array is " + ave);
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 5, 6, 7, 8};
        sum_Average(a);


    }
}
