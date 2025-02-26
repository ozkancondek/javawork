package com.example.github.oo.ex3;


public class Main {
    public static void main(String [] args){
        Rectangle rc = new Rectangle(12,5);
        System.out.println(rc.calculatePerimeter());
        rc.calculateArea();
        System.out.println(rc.getArea());
    }
}
