package com.example.demo.polyEx;

public class Programmer extends Employee{

    private double salary;
    private double bonus;

    public Programmer (String name,double salary, double bonus){
        super(name,"programmer");
        this.salary = salary;
        this.bonus = bonus;
        }

        @Override
        public double calculateSalary(){
        return salary+bonus;
        }

}
