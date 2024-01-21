package oopEncapsulation;

public class Main {
    public static void main(String[] args) {
        Student myStudent = new Student("Özkan", 3507);
        myStudent.setStudentName("ozkan changed");
        myStudent.getStudentName();
        myStudent.setStudentNo(3);
        myStudent.getStudentNo();
        // i can modify the data only with getter and setter functions
    }

}
