// Q. Create a class Game, which allows a user to play "Guess the Number" game once.
//  Game should have the following methods:
//  Constructor to generate the random number
//  takeUserInput() to take a user input of number
//  isCorrectNumber() to detect whether the number entered by the user is true
//  getter and setter for noOfGuesses
//  Use properties such as noOfGuesses(int), etc to get this task done!

import java.util.Scanner;
import java.util.Random;

class Guess {
    private int randNumber;
    private int noOfGuess;
    private int userInput;

    Guess() {
        Random number = new Random();
        this.randNumber = number.nextInt(100) + 1;
        noOfGuess = 0;
    }

    public void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        this.userInput = num;
        noOfGuess++;
    }
}
    public class exercise3_47 {
        public static void main(String[] args) {

        }
    }
