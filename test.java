import java.util.Random;
import java.util.Scanner;

class Guess_game{
    private int comp_num;
    private int user_num;
    private int chances;
    Guess_game(){
        System.out.println("Welcome to number guess game: ");
        Random r=new Random();
        comp_num=r.nextInt(100);  // 0 to 99
        chances=0;

    }
    void user_input(int x){
        user_num=x;
    }
    void correct_number(){
        if(user_num>comp_num){
            System.out.println("you slected a big number: ");
            chances++;
        }
        else if(user_num<comp_num){
            System.out.println("you slected a small number: ");
            chances++;
        }
        else{
            System.out.println("you got it right!!!");
            chances++;
            System.out.println("nNo of chances you taken: "+chances);

        }
    }

}

public class test {
    public static void main(String[] args) {
        Guess_game player1=new Guess_game();
        while(true){
            int n;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the user number : ");
            n=sc.nextInt();
            player1.user_input(n);
            player1.correct_number();
        }

    }


}