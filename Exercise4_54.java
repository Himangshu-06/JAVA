/* Q: You have to implement a library using Java Class "Library"
Methods: addBook, issueBook, returnBook, showAvailableBooks
Properties: Array to store the available books, Array to store the issued books */

import java.util.Scanner;
class Library{
    int[] availableSlots = {100};
    int count = 0;
    public void addBook(){
        count++;
    }
}
public class Exercise4_54 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the unique ID of the book: ");
        int unique = obj.nextInt();
        Library a = new Library();
        for (int i = unique; i<=0; i ++){
            a.count++;
        }
    }
}
