package oopInheritance;

public class Mammals extends Animals { // extend Animalclass

    void DrinkMilk() { // this method belong to Mammals class
        System.err.println("Drinking milk....");
    }

    // I have to define constructor here because superclass has a paremeter in its
    // constructor
    public Mammals() {
        super("Mammals");

    }

    public static void main(String[] args) {
        Mammals myMammal = new Mammals();
        System.out.println(myMammal.type);
    }

}
