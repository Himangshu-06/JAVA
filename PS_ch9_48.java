//  Q1. Create a class Cylinder and use getters and setters to set its radios and height.
class Cylinder{
    private int radios;
    private int height;

    public void setRadios(int radios){this.radios = radios;}
    public void setHeight(int height){this.height = height;}

    public int getRadios(){return radios;}
    public int getHeight(){return height;}
        }
public class PS_ch9_48 {
    public static void main(String[] args) {
        Cylinder calc = new Cylinder();

        calc.setRadios(10);
        calc.setHeight(20);

        System.out.println("Radios: "+calc.getRadios());
        System.out.println("Height: "+calc.getHeight());
    }
}
