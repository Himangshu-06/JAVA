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
        float d = ((a+b+c)/totalmarks)*100;

        if (a>=33 && b>=33 && c>=33 && d>=40){
            System.out.printf("You passed. (Your total percentage is= %.2f) \n" ,d);
        }
        else {
            System.out.println("You failed(your percentage= "+d+", Better luck next time)");
        }
    }
}
