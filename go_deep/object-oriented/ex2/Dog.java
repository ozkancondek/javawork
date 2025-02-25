package com.example.github.oo.ex2;

public class Dog {

    //variables
    private String name;
    private String breed;

    //Constructor
    public Dog(String name,String breed){
        this.breed = breed;
        this.name = name;
    }
    //getter setters
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
