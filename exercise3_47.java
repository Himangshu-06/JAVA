// Q. Create a class Game, which allows a user to play "Guess the Number" game once.
//  Game should have the following methods:
//  Constructor to generate the random number
//  takeUserInput() to take a user input of number
//  isCorrectNumber() to detect whether the number entered by the user is true
//  getter and setter for noOfGuesses
//  Use properties such as noOfGuesses(int), etc to get this task done!

import java.util.Random;
import java.util.Scanner;

class Guess{
    private int randnumber;
    private int takeUserInput;
    private int noOfAttempt;
    Guess(){
        Random rand = new Random();
        this.randnumber = rand.nextInt(10,20);
    }
    public int getRandnumber(){
        return randnumber;
    }

    public void TakeUserInput(){
        Scanner sc = new Scanner(System.in);
        this.takeUserInput = sc.nextInt();
        noOfAttempt++;
    }
    public int getTakeUserInput(){
        return this.takeUserInput;
    }
    public int getNoOfAttempt(){
        return noOfAttempt;
    }
}
public class exercise3_47 {
    public static void main(String[] args) {
        System.out.println("Enter a number between 10 - 20");
        Guess game = new Guess();

        do {
            System.out.print("Enter your lucky no :(again) ");
            game.TakeUserInput();

        }while (game.getTakeUserInput() != game.getRandnumber());
        System.out.println("Good job lad");
        System.out.println("Your no of attempts: " +game.getNoOfAttempt());
    }

}
