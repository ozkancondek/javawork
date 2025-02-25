package com.example.github.oo.ex2;

public class Main {
    public static void main(String []args){
        Dog dog1 = new Dog("real","golden");
        System.out.println(dog1.getName());
        dog1.setName("Example");
        System.out.println(dog1.getName());
    }
}
