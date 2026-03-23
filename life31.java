/*Exercise 2 Rock-Paper-Scissors game*/
import java.util.Random;
import java.util.Scanner;

public class life31 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Random number = new Random();
        int random = number.nextInt(3) + 1;
        System.out.println("Pick one option: 1.Rock or 2.Paper or 3.Scissors");
        int user = obj.nextInt();
        obj.close();
        if (user == 1) {
            System.out.println("You choose: Rock");
        } else if (user == 2) {
            System.out.println("You choose: Paper");
        } else if (user == 3) {
            System.out.println("You choose Scissors");
        }
        System.out.println("Computer choose:");
        if (random == 1) {
            System.out.println("Rock");
        } else if (random == 2) {
            System.out.println("Paper");
        } else{
            System.out.println("Scissors");
        }
        if (user == random) {
            System.out.println("Tie");
        } else if ((user == 1 && random == 3) ||
                (user == 2 && random == 1) ||
                (user == 3 && random == 2)) {
            System.out.println("User win");
        } else {
            System.out.println("Computer Wins");
        }

    }
}

/* Another way:-
String result = switch((user * 10 + random)) {
    case 13, 21, 32 -> "User win";
    case 11, 22, 33 -> "Tie";
    default -> "Computer Wins";
};
System.out.println(result);*/
