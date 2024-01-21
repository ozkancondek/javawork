package oopEncapsulation;

public class Student {
    private String studentName;
    private int studentNo;

    public Student(String studentName, int studentNo) {
        this.studentName = studentName;
        this.studentNo = studentNo;
    }

    // Now add getter and setter

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        this.studentName = name;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int no) {
        this.studentNo = no;
    }
}
