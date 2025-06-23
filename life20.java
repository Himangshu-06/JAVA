// PS_ch3_Q4 Write a program to detect double and triple spaces in a string:-
public class life20 {
    public static void main(String[] args) {
        String a = "Hi  m  ang   s   h   u";
        System.out.println(a.indexOf("  "));
        System.out.println(a.indexOf("   "));
    }
}