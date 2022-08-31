package java_100;

import java.util.Scanner;

public class FahrenheitToCelsius_5 {
    public static void main(String[] args) {
        // this for java 100
        float temperature;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit ");
        temperature=sc.nextFloat();
        temperature=((temperature-32)*5)/9;
        System.out.println("Temperature in celsius is  "+temperature);


    }
}
