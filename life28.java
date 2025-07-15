import java.util.Scanner;
public class life28 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your salary(IN LAKHS): ");
        Float a = obj.nextFloat();
        if(a<2.5){
            System.out.println("You don't have to pay any tax");
        }
        else if(a>=2.5&& a<=5.0){
            System.out.println("You have to pay 5% tax");
        }else if(a>=5.0&& a<=10.0){
            System.out.println("You have to pay 20% tax");
        }else if(a>=10.0){
            System.out.println("You have to pay 30% tax");
        }
    }
}