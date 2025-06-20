/* Write a Java program to fill in in a letter template which looks like below: letter ="Dear <|name|>, Thanks a lot"
Replace <|name|> with a string (some name):- */
public class life19 {
    public static void main(String[] args) {
        String a = "Himangshu";
        System.out.println("\"Dear "+a+", Thanks a lot\"");

        // ^_^ Other ways to do this task:-

        //1. Using String.replace() method:-
        String b = "\"Dear |<name>|, Thanks a lot\" ";
        System.out.println(b.replace("|<name>|","Himangshu"));

        //2.  Using printf()
        String c= "Himangshu";
        System.out.printf("\"Dear %s, Thanks a lot\"",c);
    }
}
