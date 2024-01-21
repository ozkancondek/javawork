package oopPolymorphism;

public class CompileTime {

    // to create a mothod overloading, create two different methods with same name
    // but different parameters

    public void sum(int num1, int num2) {
        System.out.println("Directly with ints = " + num1 + num2);
    }

    public void sum(String num1, String num2) {
        int s1 = Integer.parseInt(num1);
        int s2 = Integer.parseInt(num2);
        System.out.println("With strings to ints=" + s1 + s2);
    }

    public static void main(String[] args) {
        CompileTime myExampleObject = new CompileTime();
        myExampleObject.sum(45, 55);
        myExampleObject.sum("22", "45");

    }

}

/*
 * It calls Compile time or Static Polymorphism
 * Because its been created with method oveloading
 */
