package oop;

public class Human {
    // **********inside of the class we have variables and methods */
    public String hairColor;
    public String name;
    public int age;

    public void printHair() {
        System.out.println(hairColor);
    }

    public void printName() {
        System.out.println(name);
    }

    public void prinAge() {
        System.out.println(age);
    }
    // **********inside of the class we have variables and methods */

    public boolean checkEven(int num) {
        return num % 2 == 0 ? true : false;
    }

    public static void main(String[] args) {
        // create object now
        Human ozkan = new Human();
        ozkan.name = "ozkan";
        ozkan.age = 24;
        ozkan.hairColor = "blonde";
        ozkan.prinAge();
        ozkan.printHair();
        ozkan.printName();
        // create a new object
        Human charles = new Human();
        charles.name = "charles";
    }
}
