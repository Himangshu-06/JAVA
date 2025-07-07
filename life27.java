import java.util.Scanner;
public class life27 {
    public static void main(String[] args) {
       Scanner obj = new Scanner(System.in);
        System.out.print("Enter the marks of first subject: ");
        float a = obj.nextInt();
        System.out.print("Enter the marks of second subject: ");
        float b = obj.nextInt();
        System.out.print("Enter the marks of third subject: ");
        float c = obj.nextInt();
        obj.close();

        float d =((a/100)*100);
        float e =((b/100)*100);
        float f =((c/100)*100);

        if (d>=33 && e>=33 && f>=33){
            System.out.println("You passed");
        }
        else {
            System.out.println("You failed");
        }

        float g = (d+e+f);

        if(g>=40){
            System.out.println("You passed");
        }
        else{
            System.out.println("You failed");
        }
    }
}
