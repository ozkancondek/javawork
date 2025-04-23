package com.example.github.oo.ex23;

public class Course {


    //define variables
    private String courseName;
    private String instructor;
    private int credits;

    //Constructor
    public Course(String courseName,
                  String instructor,
                  int credits) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.credits = credits;
    }
    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Credits: " + credits);
    }

    //getters and setters
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }


}
