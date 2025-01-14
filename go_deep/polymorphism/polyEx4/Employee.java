package com.example.demo.polyEx;

public class Employee {
    private String name;
    private String role;

    public Employee(String name, String role){
             this.name = name;
             this.role = role;
    }

    public String getName(){
        return name;
    }

    public String getRole() {
        // Return the role of the employee
        return role;
    }

    public double calculateSalary(){
        return 0.0;
    }
}