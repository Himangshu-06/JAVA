/*1. Define a class Complex (without using standard class libraries) with members real and imaginary parts.
Implement constructors and define operations for addition, subtraction and multiplication of complex numbers.
Also include a function to calculate magnitude. Demonstrate the use of your class with a suitable program and
explain your design.*/
//solution:-

class Complex {
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
public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(1, 2);
        c1.add(c2);
        c1.subtract(c2);
        c1.multiply(c2);
        c1.magnitude();
    }
}

/**/