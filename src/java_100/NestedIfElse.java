package java_100;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        int Obtained, PassingMarks;
        char grade;
        PassingMarks = 60;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you score pelase");
        Obtained = sc.nextInt();
        if (Obtained >= PassingMarks) {
            if (Obtained > 90)
                grade = 'A';
            else if (Obtained >= 80 && Obtained < 90)
                grade = 'B';

            else if (Obtained >= 70 && Obtained < 80)
                grade = 'C';
            else
                grade = 'D';
            System.out.println(grade);
        } else {
            grade = 'F';
            System.out.println(grade);
        }

    }
}

