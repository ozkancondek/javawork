package oop;

public class constructorExplained {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.name = "gjelber";
        Animal animal2 = new Animal();

        // it can be more then one contructor
        // constructor has no return value and void

        Cat catObject = new Cat("mia", 5);
        Cat catObject2 = new Cat(); // i can also call it without parameters because i owerwritedit

        // Call from here

        Human humanObject = new Human();
        boolean checkven = humanObject.checkEven(71);

    }
}
