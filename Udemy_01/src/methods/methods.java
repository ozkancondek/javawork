package methods;

public class methods {
    public static void main(String[] args) {

    }

    // static:method belongs to the methods class and not an object
    public static void myMethod() {
        System.out.println("ozkan");
    }

    public static void underlineWord() {
        System.out.println("---------------------------");
    }

    public static void printParameter(String name, int age) {
        System.out.println(name + "is " + age);
    }

    public static int squareNum(int num) {
        return num * num;
    }

    public static int plusMethod(int num1, int num2) {
        return num1 + num2;
    }

    // here is recursion method

    public static int sum(int start, int end) {
        if (end < start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }
}
