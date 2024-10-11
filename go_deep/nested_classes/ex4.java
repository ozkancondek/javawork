/*
Static Nested Class:
Write a Java program to create an outer class 
called University with a static nested class Department.
The Department class should have a method "displayInfo()" that prints 
the department name and the number of faculty members.
Instantiate the Department class from the main method
and call the "displayInfo()" method.
*/

// Outer class University
public class University {
    
    // Static nested class Department
    static class Department {
        // Instance variables for Department
        private String departmentName;
        private int facultyCount;
        
        // Constructor to initialize Department
        public Department(String departmentName, int facultyCount) {
            this.departmentName = departmentName;
            this.facultyCount = facultyCount;
        }
        
        // Method to display department information
        public void displayInfo() {
            System.out.println("Department: " + departmentName);
            System.out.println("Number of Faculty Members: " + facultyCount);
        }
    }
    
    // Main method to demonstrate the static nested class
    public static void main(String[] args) {
        // Creating an instance of the static nested class Department
        University.Department compSciDept = new University.Department("Computer Science", 50);
        
        // Calling the displayInfo method
        compSciDept.displayInfo();
    }
} 
