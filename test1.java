import java.util.Scanner;
public class test1 {
        public static void main(String[] args){
            Scanner obj = new Scanner(System.in);
            int day= obj.nextInt();
            switch (day){
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                default:
                    System.out.println("Write a valid number");
            }

        }
}