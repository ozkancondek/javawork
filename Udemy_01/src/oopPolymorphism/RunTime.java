package oopPolymorphism;

public class RunTime {

    public static void main(String[] args) {
        // Engineers inherited Employee

        Employee myEmployee = new Employee();
        myEmployee.salaryCalc();

        // What if i create Employee object from Engineer class

        Employee mEmployee = new Engineers(353535);
        myEmployee.taxCalc();
        mEmployee.salaryCalc();
    }
}
