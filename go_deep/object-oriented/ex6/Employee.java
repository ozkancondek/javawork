package com.example.github.oo.ex6;

public class Employee {

    //Define variables
    private String name;
    private String job;
    private String title;
    private double salary;

    //Define Constructor
    public Employee(String name,String job, String title,double salary){
        this.name = name;
        this.job = job;
        this.title = title;
        this.salary = salary;
    }
    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    // Method to raise the salary of the employee by a given percentage
    public void raiseSalary(double percentage) {
        // Calculate the new salary by increasing the current salary by the given percentage
        salary = salary + salary * percentage / 100;
    }
    // Method to print the details of the employee
    public void printEmployeeDetails() {
        // Print the name of the employee
        System.out.println("Name: " + name);
        // Print the job title of the employee
        System.out.println("Job Title: " + job + title);
        // Print the salary of the employee
        System.out.println("Salary: " + salary);
    }


}
