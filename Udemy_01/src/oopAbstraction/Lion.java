package oopAbstraction;

public class Lion extends Animal {

    // add constructor because parent class has it aldready

    public Lion(String color) {
        super(color);
    }

    // Override method
    void myVoice(String myVoice) {
        System.out.println("my voice is " + myVoice + "....");
    }

    public static void main(String[] args) {
        // Create object of abstract class
        // Animal myAnimal = new Animal();
        // I cant here because parent is an abstract class

        Lion myLion = new Lion("red");
        myLion.printColor();
        myLion.myVoice("dwdwdd");
    }

}
