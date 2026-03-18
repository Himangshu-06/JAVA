/*1. Define a class Complex (without using standard class libraries) with members real and imaginary parts.
Implement constructors and define operations for addition, subtraction and multiplication of complex numbers.
Also include a function to calculate magnitude. Demonstrate the use of your class with a suitable program and
explain your design.*/
//solution:-

/*class Complex {
    double real, imag;
    Complex(double r, double i) {
        real = r;
        imag = i;
    }
    void add(Complex c) {
        System.out.println("Addition: " + (real + c.real) + " + " + (imag + c.imag) + "i");
    }
    void subtract(Complex c) {
        System.out.println("Subtraction: " + (real - c.real) + " + " + (imag - c.imag) + "i");
    }
    void multiply(Complex c) {
        double r = real * c.real - imag * c.imag;
        double i = real * c.imag + imag * c.real;
        System.out.println("Multiplication: " + r + " + " + i + "i");
    }
    void magnitude() {
        double m = Math.sqrt(real * real + imag * imag);
        System.out.println("Magnitude: " + m);
    }
}
class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(1, 2);
        c1.add(c2);
        c1.subtract(c2);
        c1.multiply(c2);
        c1.magnitude();
    }
}*/

/*2. A bank has different types of accounts: SavingsAccount, CurrentAccount and LoanAccount.
Design a base class Account with functions deposit(), withdraw() and getBalance().
Derive the three classes and override withdraw() according to different rules.
Demonstrate runtime polymorphism and explain how overriding helps in this situation.
*/

/*class Account {
    String owner;
    double balance;

    Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    void withdraw(double amount) {
        System.out.println("Withdraw not defined.");
    }
    void getBalance() {
        System.out.println("Balance: " + balance);
    }
}
class SavingsAccount extends Account {
    SavingsAccount(String owner, double balance) {
        super(owner, balance);
    }
    void withdraw(double amount) {
        if (balance - amount < 500)
            System.out.println("Cannot withdraw! Minimum balance 500 required.");
        else {
            balance -= amount;
            System.out.println("Savings withdrawal done. Balance: " + balance);
        }
    }
}
class CurrentAccount extends Account {
    CurrentAccount(String owner, double balance) {
        super(owner, balance);
    }
    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Current withdrawal done. Balance: " + balance);
    }
}
class LoanAccount extends Account {
    LoanAccount(String owner, double balance) {
        super(owner, balance);
    }
    void withdraw(double amount) {
        System.out.println("Withdrawal not allowed on Loan account.");
    }
}
class Main {
    public static void main(String[] args) {
        Account a1 = new SavingsAccount("Alice", 9000);
        Account a2 = new CurrentAccount("Bob", 9000);
        Account a3 = new LoanAccount("Charlie", 9000);
        a1.withdraw(600);
        a2.withdraw(600);
        a3.withdraw(600);
    }
}*/

/*3. Create an abstract base class Shape with functions area() and perimeter().
Derive classes Circle, Rectangle and Triangle.
Write a program to store objects of different shapes in a single collection and display their area and perimeter.
Explain how polymorphism is achieved.*/

/*abstract class Shape {
    abstract double area();
    abstract double perimeter();

    void display() {
        System.out.println("Area: " + area() + "  Perimeter: " + perimeter());
    }
}
class Circle extends Shape {
    double radius;
    Circle(double r) {
        radius = r;
    }
    double area() {
        return 3.14 * radius * radius;
    }
    double perimeter() {
        return 2 * 3.14 * radius;
    }
    void display() {
        System.out.print("Circle    -> ");
        super.display();
    }
}
class Rectangle extends Shape {
    double length, width;
    Rectangle(double l, double w) {
        length = l;
        width = w;
    }
    double area() {
        return length * width;
    }
    double perimeter() {
        return 2 * (length + width);
    }
    void display() {
        System.out.print("Rectangle -> ");
        super.display();
    }
}
class Triangle extends Shape {
    double a, b, c;
    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    double perimeter() {
        return a + b + c;
    }
    void display() {
        System.out.print("Triangle  -> ");
        super.display();
    }
}
class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);
        Shape s3 = new Triangle(3, 4, 5);
        s1.display();
        s2.display();
        s3.display();
    }
}*/

/*4. Design a class Student with private data members roll, name and marks of five subjects.
Provide functions to input marks, validate them and compute total, percentage and grade.
Display the result of the student.
Explain how encapsulation improves reliability.*/
/*import java.util.Scanner;

class Student {
    int roll;
    String name;
    double marks[] = new double[5];
    void inputMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll: ");
        roll = sc.nextInt();
        System.out.print("Enter Name: ");
        name = sc.next();
        for (int i = 0; i < 5; i++) {
            System.out.print("Marks of subject " + (i + 1) + ": ");
            marks[i] = sc.nextDouble();
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid! Enter again.");
                marks[i] = sc.nextDouble();
            }
        }
    }
    double total() {
        double t = 0;
        for (int i = 0; i < 5; i++)
            t += marks[i];
        return t;
    }
    double percentage() {
        return total() / 5;
    }
    String grade() {
        double p = percentage();
        if (p >= 90) return "A+";
        else if (p >= 75) return "A";
        else if (p >= 60) return "B";
        else if (p >= 45) return "C";
        else return "F";
    }
    void display() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Total: " + total());
        System.out.println("Percentage: " + percentage());
        System.out.println("Grade: " + grade());
    }
}
class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.inputMarks();
        s.display();
    }
}*/

/*5. Design classes for a Library system: Book, Member and Library.
Implement functions to issue and return books.
Ensure that a book cannot be issued if it is already issued.
Demonstrate the interaction between classes and explain composition*/

/*class Book {
    String title;
    boolean issued;

    Book(String title) {
        this.title = title;
        issued = false;
    }
}
class Member {
    String name;
    Member(String name) {
        this.name = name;
    }
}
class Library {
    Book books[] = new Book[10];
    int count = 0;
    void addBook(String title) {
        books[count] = new Book(title);
        count++;
        System.out.println("Book added: " + title);
    }
    void issueBook(String title, Member m) {
        for (int i = 0; i < count; i++) {
            if (books[i].title.equals(title)) {
                if (books[i].issued)
                    System.out.println("Book already issued!");
                else {
                    books[i].issued = true;
                    System.out.println(title + " issued to " + m.name);
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }
    void returnBook(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].title.equals(title)) {
                books[i].issued = false;
                System.out.println(title + " returned.");
                return;
            }
        }
        System.out.println("Book not found.");
    }
}

class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook("Java Book");
        Member m1 = new Member("Alice");
        Member m2 = new Member("Bob");
        lib.issueBook("Java Book", m1);
        lib.issueBook("Java Book", m2);  // already issued
        lib.returnBook("Java Book");
        lib.issueBook("Java Book", m2);  // now works
    }
}*/

/*6. A company has different types of employees: Manager, Engineer, and Intern. Each employee has a method
calculateSalary(). Write a program to:
i. Define a base class Employee
ii. Derive the three classes
iii. Override calculateSalary() in each class
iv. Show how the same function call gives different results
v. Explain the role of overriding in polymorphism.*/

/*class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
    double calculateSalary() {
        return 0;
    }
    void display() {
        System.out.println(name + " salary: " + calculateSalary());
    }
}
class Manager extends Employee {
    Manager(String name) {
        super(name);
    }
    double calculateSalary() {
        return 80000;
    }
}
class Engineer extends Employee {
    Engineer(String name) {
        super(name);
    }
    double calculateSalary() {
        return 55000;
    }
}
class Intern extends Employee {
    Intern(String name) {
        super(name);
    }
    double calculateSalary() {
        return 15000;
    }
}
class Main {
    public static void main(String[] args) {
        Employee e1 = new Manager("Raj");
        Employee e2 = new Engineer("Priya");
        Employee e3 = new Intern("Sam");
        e1.display();
        e2.display();
        e3.display();
    }
}*/

/*7. A shopping application supports different payment methods: Cash, Card and UPI.
Design a base class Payment with method pay(amount) and derive classes for each method.
Implement different processing logic for each class.
Demonstrate how polymorphism avoids multiple conditional statements.*/

/*class Payment {
    void pay(double amount) {
        System.out.println("Processing payment...");
    }
}
class Cash extends Payment {
    void pay(double amount) {
        System.out.println("Paid Rs." + amount + " in cash.");
    }
}
class Card extends Payment {
    void pay(double amount) {
        double fee = amount * 0.02;
        System.out.println("Card payment Rs." + amount + " done. Fee: Rs." + fee);
    }
}
class UPI extends Payment {
    void pay(double amount) {
        System.out.println("UPI payment of Rs." + amount + " successful.");
    }
}
class Main {
    public static void main(String[] args) {
        Payment p1 = new Cash();
        Payment p2 = new Card();
        Payment p3 = new UPI();
        p1.pay(500);
        p2.pay(500);
        p3.pay(500);
    }
}*/

/*8. A vehicle rental system includes Car, Bike and Truck derived from a base class Vehicle.
Each vehicle has a function rentCost(days).
Override this function in each derived class.
Demonstrate how the same function call gives different results.
*/

/*class Vehicle {
    String type;
    Vehicle(String type) {
        this.type = type;
    }
    double rentCost(int days) {
        return 0;
    }
    void display(int days) {
        System.out.println(type + " rent for " + days + " days: Rs." + rentCost(days));
    }
}
class Car extends Vehicle {
    Car() {
        super("Car");
    }
    double rentCost(int days) {
        return days * 1500;
    }
}
class Bike extends Vehicle {
    Bike() {
        super("Bike");
    }
    double rentCost(int days) {
        return days * 500;
    }
}
class Truck extends Vehicle {
    Truck() {
        super("Truck");
    }
    double rentCost(int days) {
        return days * 3000;
    }
}
class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        Vehicle v3 = new Truck();
        v1.display(3);
        v2.display(3);
        v3.display(3);
    }
}*/

/*9. Design a class MyString without using standard string library functions.
Implement functions for length, concatenation and comparison of strings.
Demonstrate the usage and explain memory management issues.*/

/*class MyString {
    char chars[];
    int len;
    MyString(String s) {
        len = s.length();
        chars = new char[len];
        for (int i = 0; i < len; i++)
            chars[i] = s.charAt(i);
    }

    int length() {
        return len;
    }
    void concat(MyString s) {
        System.out.print("Concatenated: ");
        for (int i = 0; i < len; i++)
            System.out.print(chars[i]);
        for (int i = 0; i < s.len; i++)
            System.out.print(s.chars[i]);
        System.out.println();
    }
    void compare(MyString s) {
        if (len != s.len) {
            System.out.println("Strings are NOT equal.");
            return;
        }
        for (int i = 0; i < len; i++) {
            if (chars[i] != s.chars[i]) {
                System.out.println("Strings are NOT equal.");
                return;
            }
        }
        System.out.println("Strings are EQUAL.");
    }
    void display() {
        for (int i = 0; i < len; i++)
            System.out.print(chars[i]);
        System.out.println();
    }
}
class Main {
    public static void main(String[] args) {
        MyString s1 = new MyString("Hello");
        MyString s2 = new MyString(" World");
        MyString s3 = new MyString("Hello");

        s1.concat(s2);
        System.out.println("Length: " + s1.length());
        s1.compare(s2);
        s1.compare(s3);
    }
}*/

/*10. Define a class Point3D with coordinates (x, y, z).
Implement functions for vector addition, subtraction, distance between two points, and centroid of three points.
Write a program to demonstrate these operations and explain your approach.*/

/*
class Point3D {
    double x, y, z;
    Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    void add(Point3D p) {
        System.out.println("Addition: (" + (x+p.x) + ", " + (y+p.y) + ", " + (z+p.z) + ")");
    }
    void subtract(Point3D p) {
        System.out.println("Subtraction: (" + (x-p.x) + ", " + (y-p.y) + ", " + (z-p.z) + ")");
    }
    void distance(Point3D p) {
        double d = Math.sqrt((x-p.x)*(x-p.x) + (y-p.y)*(y-p.y) + (z-p.z)*(z-p.z));
        System.out.println("Distance: " + d);
    }
    void centroid(Point3D p1, Point3D p2) {
        double cx = (x + p1.x + p2.x) / 3;
        double cy = (y + p1.y + p2.y) / 3;
        double cz = (z + p1.z + p2.z) / 3;
        System.out.println("Centroid: (" + cx + ", " + cy + ", " + cz + ")");
    }
}
class Main {
    public static void main(String[] args) {
        Point3D p1 = new Point3D(1, 2, 3);
        Point3D p2 = new Point3D(4, 5, 6);
        Point3D p3 = new Point3D(7, 8, 9);
        p1.add(p2);
        p1.subtract(p2);
        p1.distance(p2);
        p1.centroid(p2, p3);
    }
}*/
