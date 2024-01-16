package oop;

public class Cat {
    public String name;
    public String color;
    public int age;

    // class name and constructor should be same name
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        color = "black";
    }
    // tomake parameters optional iam owrwriting

    public Cat() {
    };
}
