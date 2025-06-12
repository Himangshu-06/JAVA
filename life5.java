//Write a program to convert distance in kilometer to miles.
import java.util.Scanner;
public class life5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the distance in kilometer: ");
        float a = obj.nextFloat();
        float miles = a/ 1.609f;
        System.out.printf("The distance in miles is: %.2f\n",miles);
        // Close the Scanner to free up resources
        obj.close();

    }
}
