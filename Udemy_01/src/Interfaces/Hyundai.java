package Interfaces;

public class Hyundai implements Car, Transport {
    // I have to override interface methods here
    @Override
    public void goal() {
        System.out.println("Carry me .....");
    }

    @Override
    public void color() {
        System.out.println("Color is red....");
    }

    public static void main(String[] args) {
        // Car myCar = new Car();
        // That wouldnt work because i cant create an object from interface

        Hyundai myObject = new Hyundai();
        Car myObject2 = new Hyundai();
        myObject2.color();
        myObject.color();
    }

}
