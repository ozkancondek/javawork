package oop;

public class Animal {
    public String name;
    public String type;
    final int age; // fixingthe value

    public void outPrint() {
        System.out.println("here is default class method");
    }

    // contructor means initial values

    public Animal() {
        name = "felix";
        type = "dog";
        age = 4;
        outPrint(); // trigger method. Add here and class has it by default
    }

}
