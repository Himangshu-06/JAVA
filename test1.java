import java.util.Scanner;
public class test1 {
    public static void main (String[] args){
        Scanner obj= new Scanner((System.in));
        System.out.println("Enter 1st subject marks: ");
        int first = obj.nextInt();
        System.out.println("Enter 2nd subject name: ");
        int second = obj.nextInt();
        System.out.println("Print 3rd subject name: ");
        int third = obj.nextInt();

        float percentage= (float) (first + second + third)/ 3.00f;
        if(first>=33 && second>=33 && third>=33 && percentage>=40){
            System.out.println("You passed");
        }
        else{
            System.out.println("You failed");
        }
    }
}
