package Encapsulation;

public class Student {
    private String studentName;
    private int studentNumber;

    public Student(String studentName, int studentNumber) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
    }

    // add getter and setter

    public String getName() {
        return studentName;
    }

    public void setName(String name) {
        this.studentName = name;
    }

    // studentNumber ony readable
    public int getNumber() {
        return studentNumber;

    }
}
