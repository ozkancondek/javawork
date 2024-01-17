package oopInheritance;

public class Animals {
    String type;

    public Animals(String type) {
        this.type = type;
        System.err.println("here is constructor method in parent class");
    }

    void Eat() {
        System.err.println("Eating....");
    }

    void Breathe() {
        System.err.println("Breathing......");
    }
}
