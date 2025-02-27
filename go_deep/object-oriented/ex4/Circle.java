package com.example.github.oo.ex4;

public class Circle {

    //define variable
    private double radius;
    final double pi = 3.14;

    //Constructor

    public Circle(double radius){
        this.radius = radius;
    }

    //getters and setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getArea(){
        return radius*radius*pi;
    }

    public double getCircumference(){
        return 2*pi*radius;
    }
}
