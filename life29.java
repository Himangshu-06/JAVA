/*PS_Ch4_Q3 Write a Java program to find out the day of the week given the number [1 for monday, 2 for
Tuesday... and so on..]*/
import java.util.Scanner;
public class life29 {
        public static void main(String[] args){
            Scanner obj = new Scanner(System.in);
            System.out.print("Write your number: \t");
            int day= obj.nextInt();
            switch (day){
                case 1 ->System.out.println("Sunday");
                case 2 ->System.out.println("Monday");
                default ->System.out.println("Write a valid number");
            }

        }
}