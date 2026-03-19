import java.util.Scanner;
public class life30 {
    public static void main(String[] args){
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter the domain: ");
        String domain = obj.nextLine();
        switch (domain){
            case".com" ->System.out.println("Commercial website");
            case ".org"-> System.out.println("Organisation website");
            case ".in"-> System.out.println("Indian website");
        }
    }
}
