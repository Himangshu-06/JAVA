//Write A Program to calculate percentage of A given student in CBSE board exam. His marks from 5 Subjects must be taken as input from the keyboard (Marks are out of 100)
import java.util.Scanner;
public class life7 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your Marks");
        System.out.println("Subject 1: " );
        float a = obj.nextFloat();
        System.out.println("Subject 2: " );
        float b = obj.nextFloat();
        System.out.println("Subject 3: " );
        float c = obj.nextFloat();
        System.out.println("Subject 4: " );
        float d = obj.nextFloat();
        System.out.println("Subject 5: " );
        float e = obj.nextFloat();
        obj.close();
        float percent= ((a+b+c+d+e)*100)/ 500;
        System.out.println("Your percentage is: "+percent);



    }
}
