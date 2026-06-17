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
    private final int randNumber;
    private int userGuess;
    private int noOfAttempt = 0;
    Guess(){
        Random rand = new Random();
        this.randNumber = rand.nextInt(10,20);
    }
    public int getRandNumber(){
        return randNumber;
    }

    public void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        this.userGuess = sc.nextInt();
        noOfAttempt++;
    }
    public int getUserGuess(){
        return this.userGuess;
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
            game.takeUserInput();

        }while (game.getUserGuess() != game.getRandNumber());
        System.out.println("Good job lad");
        System.out.println("Your no of attempts: " +game.getNoOfAttempt());
    }

}
