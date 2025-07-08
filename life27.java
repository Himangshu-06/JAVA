// PS_ch4_Q2
/*Write a program to find out whether a Student is pass or fail, If it
requires total 40% and at least 33% in each subject to pass.
Assume 3 subjects and take marks as an input from the user*/
// Vid 19

import java.util.Scanner;

public class life27 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the marks of first subject: ");
        float a = obj.nextFloat();
        System.out.print("Enter the marks of second subject: ");
        float b = obj.nextFloat();
        System.out.print("Enter the marks of third subject: ");
        float c = obj.nextFloat();
        obj.close();

        int totalmarks = 300;
        float d = ((a + b + c) / totalmarks) * 100;

        if (a >= 33 && b >= 33 && c >= 33 && d >= 40) {
            System.out.printf("You passed. (Your total percentage is= %.2f%%)\n", d);
        } else {
            System.out.printf("You failed(your percentage is= %.2f%% Better luck next time)\n", d);
        }
    }
}
