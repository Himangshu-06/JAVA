//Write a program which asks the user to enter their name and then prints "Hello <name>, Have a nice day" text.
import java.util.Scanner;
public class life3{
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter your name: ");
        String a = obj.nextLine();
        System.out.print("Hello " +a + ", Have a Good day");
    }
}
