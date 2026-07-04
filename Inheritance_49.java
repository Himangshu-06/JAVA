class Animal{
    private int noOfLegs;
    private boolean canFly;

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public boolean getCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}

class Dog extends Animal{
    private boolean bark;
    private boolean walk;

    public boolean isBark() {
        return bark;
    }

    public int setBark(boolean bark) {
        this.bark = bark;
        return bark;
    }

    public boolean isWalk() {
        return walk;
    }

    public void setWalk(boolean walk) {
        this.walk = walk;
    }
}
public class Inheritance_49 {
    public static void main(String[] args) {
        Animal specs = new Animal();
        Dog attri = new Dog();

        System.out.println("No of legs: " +attri.setNoOfLegs());
        System.out.println("Can fly ?= " +attri.setCanFly(false));
    }
}
