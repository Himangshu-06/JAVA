// If else if ladder:-
//vid 18
import java.util.Scanner;

public class life24 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int a = obj.nextInt();
        if (a >= 90) {
            System.out.println("Excellent😁");
        } else if (a >= 80) {
            System.out.println("Well done☺️");
        } else if (a >= 70) {
            System.out.println("Very Good😉");
        } else if (a >= 60) {
            System.out.println("Good😏");
        } else if (a >= 50) {
            System.out.println("Nice😌");
        } else if (a >= 40) {
            System.out.println("Need improvement");
        } else if (a >= 30) {
            System.out.println("Barely pass");
        } else{
            System.out.println("Better luck next time");
        }
    }
}
