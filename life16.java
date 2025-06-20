// Demonstration of String methods:-
import  java.util.Scanner;
public class life16 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        String me = obj.nextLine();

        int num = me.length();
        System.out.println(num);
        //or
        System.out.println(me.length());

        String lcase = me.toLowerCase();
        System.out.println(lcase);
        //or
        System.out.println(me.toLowerCase());

        String ucase = me.toUpperCase();
        System.out.println(ucase);
        //or
        System.out.println(me.toUpperCase());

        System.out.println(me.trim());

//        System.out.println(me.substring(3));
//        System.out.println(me.substring(1,4));

        System.out.println(me.replace('r','p')); //put Harry
        System.out.println(me.replace("ngshu","_06")); //put Himangshu
        System.out.println(me.replace("r","ier")); //put Harry

        System.out.println(me.startsWith("Him")); //put Himangshu
        System.out.println(me.endsWith("shu"));

        System.out.println(me.charAt(2));

        System.out.println(me.indexOf("m"));
        System.out.println(me.indexOf("m", 3));
        System.out.println(me.lastIndexOf("shu"));
        System.out.println(me.lastIndexOf("a",3));

        System.out.println(me.equals("Himangshu"));
        System.out.println(me.equalsIgnoreCase("HiManGshu"));

        // Escape sequence characters :-
        System.out.println("Hello \n world");
        System.out.println("Hello\tworld");
        System.out.println("Hello \"hola\" world");
        System.out.println("Hello \'Hola\' world");
        System.out.println("Hello \\ world");

        // Escape Sequence Characters for Quick Reference:
//       \n   - New line (moves cursor to next line)
//       \t   - Tab (adds a horizontal space)
//       \"   - Double quote (includes " in a string)
//       \'   - Single quote (includes ' in a char or string)
//       \\   - Backslash (includes \ in a string)
//       \r   - Carriage return (moves cursor to start of line)
//       \b   - Backspace (deletes one character backward)
//       \f   - Form feed (advances to next page in some contexts)
    }
}
