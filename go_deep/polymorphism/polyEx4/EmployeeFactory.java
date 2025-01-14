package com.example.demo.polyEx;

public class EmployeeFactory extends Employee{
    private double baseSalary;
    private double bonus;

    public EmployeeFactory(String name, String role,double baseSalary,double bonus){
        super(name,role);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }
    @Override
    public double calculateSalary(){
        return baseSalary + bonus;
    }
}
