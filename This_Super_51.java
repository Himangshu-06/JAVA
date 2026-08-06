//  From Telusko video no #51 - https://youtu.be/u2oT-qogaFI
class Class1{

}
public class This_Super_51 {
    public static void main(String[] args) {

/* Notes from Telusko-

#1
Whenever you call an object, it will create a constructor of a class.
When we create an object of a class that it calls the constructor of a subclass as well as a constructor of a superclass.
If you do not pass any value in an object, then it will call the default constructor of a class.
But if you pass the value in an object, then it will call the parameterised constructor of that class.

#2 Super() method:-
Every constructor in Java has a method, even if you do not mention it.
By default, the first statement in every constructor is a method called a super() method.
Super() method means calls the constructor of a superclass.
If you do not pass any parameter in a super method, then it will call the default constructor of a superclass.
If you pass any parameter in a super method, then it will call the parameterised constructor of a superclass.
To call the parameterised constructor of a parent class, we need to explicitly call the super method.

#3 Object class:-
Every class in Java extends the Object class, even if you do not mention it.
Object is a class in Java that contains a lot of methods.
So, the super method of a superclass calls the constructor of an object class.
There is multi-level inheritance in this concept.

#4 This() method:-
this() method calls the constructor of the same class.
If you do not pass any parameter in this method, then it will call the default constructor of the same class.
If you pass any parameter in this method, then it will call the parameterised constructor of the same class.

#5 Similarities in between this() and super() method:-
We can use both this and super method anywhere except the static area.
Both this and super method can be used any number of times in a code.
But both can be used only one time inside a constructor.
Both are non-static keywords.

Notes from CwH -

#1 "this" keyword :
this is a way for us to reference an object of the class which is being created/referenced.
It is used to call the default constructor of the same class.
this keyword eliminates the confusion between the parameters and the class attributes with the same name.

#2 Super keyword
A reference variable used to refer immediate parent class object.
It can be used to refer immediate parent class instance variable.
It can be used to invoke the parent class method.
*/
    }
}
