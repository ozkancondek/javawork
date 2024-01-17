package Encapsulation;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Student myStudentObject = new Student("Özkan", 3507);
        // myStudentObject.studentName woudnt wor´k becuse its private
        String currentName = myStudentObject.getName();
        System.out.println(currentName);
        myStudentObject.setName("name update");
        String updatedName = myStudentObject.getName();
        int myStudentNumber = myStudentObject.getNumber();

    }
}