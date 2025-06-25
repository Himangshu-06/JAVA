import java.util.Scanner;
public class life22 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = obj.nextInt();
        if (age>=18)
        {
            System.out.println("You can vote");
        }
        else{
            System.out.println("You can't vote");
        }
    }
}
