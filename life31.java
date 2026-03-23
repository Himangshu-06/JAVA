import java.util.Random;
import java.util.Scanner;
public class life31 {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        Random number = new Random();
        int random = number.nextInt(4);
        System.out.println("Pick one option: 1.Rock or 2.Paper or 3.Scissors");
        int user= obj.nextInt();
        if(user==1){
            System.out.println("You choose: Rock");
        } else if (user==2) {
            System.out.println("You choose: Paper");
        } else if (user==3) {
            System.out.println("You choose Scissors");
        }
        if (random == 1) {
            System.out.println("Rock");
        } else if (random == 2) {
            System.out.println("Paper");
        } else if (random == 3) {
            System.out.println("Scissors");
        }
        System.out.println("Computer choose:");
        if(user==random){
            System.out.println("Tie");
        } else if (user==1 && random==3) {
            System.out.println("User win");
        } else if (user==2 && random==1) {
            System.out.println("User win");
        } else if (user==3 && random==2) {
            System.out.println("User win");
        }else {
            System.out.println("Computer Wins");
        }

    }
}
