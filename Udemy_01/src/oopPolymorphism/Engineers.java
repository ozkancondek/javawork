package oopPolymorphism;

public class Engineers extends Employee {
    private int salary;
    private int tax;

    @Override
    public void salaryCalc() {
        salary -= tax;
        System.out.println("Net income=" + salary);
    }

    @Override
    public void taxCalc() {
        int tax = ((salary * 30) / 100);
        System.out.println("Tax is=" + tax);
    }

    // This method is belong the this class

    public void prinDocument() {
        System.out.println("Document printed");
    }

    public Engineers(int salary) {
        this.salary = salary;
    }

}
