class Species{
    public Species() {
        System.out.println("Hi");
    }
    public Species(int a){
        System.out.println("This is a overloaded constructor with a value: "+a);
    }
}

class Human extends Species{
    public Human() {
        super(20);
        System.out.println("In derived class");
    }
}
public class Constructors_In_Inheritance_50 {
    public static void main(String[] args) {
        Human obj = new Human();
    }
}
