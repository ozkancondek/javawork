package com.example.github.oo.ex3;

public class Rectangle {

    //Define variables
    private double length;
    private double width;

    private double area;

    //Constructor
    public Rectangle(double length,double width){

        this.length = length;
        this.width = width;
    }

    //getters and setters
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //calculation
    public double  calculatePerimeter(){
        return length*width*2;
    }
    //used
    public void calculateArea( ){
        area = length*width;
    }

    //give area back
    public double getArea(){
        return area;
    }

}
