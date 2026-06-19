class Cylinder{
//    Q1. Create a class Cylinder and use getters and setters to set its radios and height.
//    Created using generate feature of IntelliJ IDEA;
    private int radios;
    private int height;

    public int getRadios() {
        return radios;
    }

    public void setRadios(int radios) {
        this.radios = radios;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

//    Q2. Use Q1 to calculate surface area and volume of the cylinder.

        }
public class PS_ch9_48 {
    public static void main(String[] args) {
        Cylinder calc = new Cylinder();

        calc.setRadios(10);
        calc.setHeight(20);

        System.out.println("Radios: "+calc.getRadios());
        System.out.println("Height: "+calc.getHeight());
        System.out.println(Math.PI);
    }
}
