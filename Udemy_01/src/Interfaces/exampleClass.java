package Interfaces;

public class exampleClass extends Hyundai implements Car {

    // now i dont have to override
    public static void main(String[] args) {
        exampleClass myObj = new exampleClass();
        myObj.color(); // comes from Hyundai

    }

}