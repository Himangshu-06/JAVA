// Q. Create a class Game, which allows a user to play "Guess the Number" game once.
//  Game should have the following methods:
//  Constructor to generate the random number
//  takeUserInput() to take a user input of number
//  isCorrectNumber() to detect whether the number entered by the user is true
//  getter and setter for noOfGuesses
//  Use properties such as noOfGuesses(int), etc to get this task done!

import java.util.Scanner;
import java.util.Random;

class Guess{
    private int randnumber;
    private int takeUserInput;
    Guess(){
        Random rand = new Random();
        this.randnumber = rand.nextInt(10,20);
        System.out.println(randnumber);
    }

    public void TakeUserInput(){
        Scanner sc = new Scanner(System.in);
        this.takeUserInput = sc.nextInt();

    }
}
public class exercise3_47 {
    public static void main(String[] args) {
        Guess game = new Guess();

        do {
            System.out.println("Enter a guess: ");
        }while (game != )
    }
}
