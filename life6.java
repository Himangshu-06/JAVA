//write a program to check whether the user input is an integer or not.
import java.util.Scanner;
public class life6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        System.out.println("(The input is a integer)- This statement is " +obj.hasNextInt());
    }
}