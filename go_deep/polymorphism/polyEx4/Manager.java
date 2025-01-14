package com.example.demo.polyEx;

public class Manager extends Employee{

    private double baseSalary;
    private double bonus;
    public Manager(String name, double baseSalary, double bonus) {
        // Call the constructor of the superclass Employee with name and role "Manager"
        super(name, "Manager");
        // Assign the parameter baseSalary to the instance variable baseSalary
        this.baseSalary = baseSalary;
        // Assign the parameter bonus to the instance variable bonus
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary(){
        return baseSalary + bonus;
    }
}
