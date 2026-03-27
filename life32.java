import java.util.Scanner;
public class life32 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int age = obj.nextInt();
        while (age>18){
            System.out.println("Yo");
            break;
        }
    }
}
