/*PS_Ch4_Q6*/
import java.util.Scanner;
public class life30 {
    public static void main(String[] args){
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter the domain: ");
        String domain = obj.nextLine();
        if(domain.endsWith(".com")){
            System.out.println("Commercial website");
        } else if(domain.endsWith(".org")){
            System.out.println("Organization website");
        } else if (domain.endsWith(".in")) {
            System.out.println("Indian website");
        }
    }
}
