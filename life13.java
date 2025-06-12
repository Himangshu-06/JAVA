
import java.util.Scanner;
public class life13 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the values for u, v and a: ");
        float v= obj.nextFloat();
        float u= obj.nextFloat();
        float a= obj.nextFloat();
        float ans = ((v*v)-(u*u))/ (2*a*5);
        System.out.println("Solution: " +ans);
    }
}
    