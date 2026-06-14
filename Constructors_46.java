 /* Constructor - A constructor is a special method that runs automatically when you create an object. Its job is to set up the initial values of that object.
      Two things that make it special:
  It has the same name as the class
  It has no return type

      Field - A field (also called an instance variable) is a variable that belongs to a class and represents the state of an object. Each object of the class has its own copy of these variables.

      State - The state of an object refers to the current values of its fields (instance variables) at any given time. It describes what the object knows or what data it holds.

      A variable is a field (instance variable) only if:
  It is declared inside a class but outside any method or constructor.
  It belongs to each instance (object) of the class.
  It represents the state of the object.*/
public class Constructors_46 {
    String name;
    int roll;
    Constructors_46(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
}
