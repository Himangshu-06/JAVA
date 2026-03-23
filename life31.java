import java.util.Random;
import java.util.Scanner;
public class life31 {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        Random number = new Random();
        int random = number.nextInt(4);
        System.out.println("Pick one option: 1.Rock or 2.Paper or 3.Scissors");
        int side= obj.nextInt();
        if (random == 1) {
            System.out.println("Rock");
        } else if (random == 2) {
            System.out.println("Paper");
        } else if (random == 3) {
            System.out.println("Scissors");
        }
        if(side==random){
            System.out.println("Tie");
        } else if (side==1 && random==) {
            System.out.println("User win");
        } else if (side==2) {
            System.out.println("User win");
        } else if (side==3) {
            System.out.println("User win");
        }

    }
}
