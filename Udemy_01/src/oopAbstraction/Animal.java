package oopAbstraction;

public abstract class Animal {
    String color;

    public Animal(String color) {
        this.color = color;
    }

    abstract void myVoice(String myVoice);
    // when i have abstract method, class name have to be abstract either

    public void printColor() {
        System.out.println("My color is " + color);
    }

}
