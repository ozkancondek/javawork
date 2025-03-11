package com.example.github.oo.ex10;

import java.util.ArrayList;

public class Student {

    //define variables
    private String name;
    private int grade;

    private ArrayList courses;

    //Constructor
    public Student(String name,int grade){
        this.name = name;
        this.grade=grade;
        this.courses = new ArrayList();
    }
    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public ArrayList getCourses() {
        return courses;
    }

    // Method to add a course to the student's course list
    public void addCourse(String course) {
        // Add the given course to the courses ArrayList
        courses.add(course);
    }

    // Method to remove a course from the student's course list
    public void removeCourse(String course) {
        // Remove the given course from the courses ArrayList
        courses.remove(course);
    }

    // Method to print the details of the student
    public void printStudentDetails() {
        // Print the name of the student
        System.out.println("Name: " + name);

        // Print the grade of the student
        System.out.println("Grade: " + grade);
    }

}
