class Cylinder{
//    Q1. Create a class Cylinder and use getters and setters to set its radios and height.
//    Created using generate feature of IntelliJ IDEA;
    private int radios;
    private int height;

    public int getRadios() {
        return radios;
    }

    public void setRadios(int radios){
        this.radios = radios;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

//    Q2. Use Q1 to calculate surface area and volume of the cylinder.
    public double getSurfaceArea() {
        return 2*Math.PI*radios*height+2*Math.PI*radios*radios;
    }

    public double getVolume() {
        return Math.PI*radios*radios*height;
    }

//    Q3. Use a constructor and repeat Q1
    Cylinder(int radios,int height){
        this.radios = radios;
        this.height = height;
    }
//    Q4. Overload a constructor used to initialize a rectangle of length 4 and 5 for using custom parameters.
    Cylinder(int length, int breath, int result){

    }
}
public class PS_ch9_48 {
    public static void main(String[] args) {
//        Q1 & Q3:
        Cylinder calc = new Cylinder(1,2);

        System.out.println("Radios: "+calc.getRadios());
        System.out.println("Height: "+calc.getHeight());

//        Q2:
        System.out.printf("Surface area: %.2f%n",calc.getSurfaceArea());
        System.out.printf("Volume: %.2f",calc.getVolume());
    }
}
