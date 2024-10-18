/*
Static Nested Class and Non-static Methods:
Write a Java program to create an outer class called School with a 
static nested class Student. The Student class should have a non-static
method displayStudentInfo() that prints the student's name and grade.
Instantiate the Student class from the main method and call the displayStudentInfo() method.
*/
// Outer class School
public class School {
    // Static nested class Student
    static class Student {
        // Instance variables for student's name and grade
        String name;
        String grade;

        // Constructor for Student class
        Student(String name, String grade) {
            this.name = name;
            this.grade = grade;
        }

        // Non-static method to display student information
        void displayStudentInfo() {
            System.out.println("Student Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }

    // Main method to demonstrate creating an instance of the static nested class
    public static void main(String[] args) {
        // Creating an instance of the static nested class Student
        School.Student student = new School.Student("Julius Helga", "A");

        // Calling the displayStudentInfo method to print student details
        student.displayStudentInfo();
    }
}
