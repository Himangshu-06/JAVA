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

        System.out.println(me.substring(3));
        System.out.println(me.substring(1,4));
    }
}
