//import java.util.Scanner;
//import java.util.Random;
//
//class Guess {
//    private int randomNumber;
//    private int noOfGuesses;
//
//    Guess() {  // Constructor name now matches class name
//        Random random = new Random();
//        this.randomNumber = random.nextInt(100) + 1; // Generate number 1-100
//        this.noOfGuesses = 0;
//    }
//
//    void takeUserInput() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your guess: ");
//        int userGuess = sc.nextInt();
//        noOfGuesses++;
//        isCorrectNumber(userGuess);
//    }
//
//    void isCorrectNumber(int userGuess) {
//        if (userGuess == randomNumber) {
//            System.out.println("Correct! You guessed it in " + noOfGuesses + " attempts!");
//        } else if (userGuess < randomNumber) {
//            System.out.println("Too low, try again!");
//        } else {
//            System.out.println("Too high, try again!");
//        }
//    }
//
//    int getNoOfGuesses() {
//        return noOfGuesses;
//    }
//
//    void setNoOfGuesses(int noOfGuesses) {
//        this.noOfGuesses = noOfGuesses;
//    }
//}
//
//public class Proving_Ground {
//    public static void main(String[] args) {
//        Guess game = new Guess();
//        game.takeUserInput();
//    }
//}