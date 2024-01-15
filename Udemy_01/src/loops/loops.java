package loops;

public class loops {
    public static void main(String[] args) {
        int i = 0;

        // While loop
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // Do While loop

        // This loop will execute the code block once, before checking if the condition
        // is true
        // the it will repeat the loop as long as the condition is true
        do {
            i++;
            // code to be executed / loop body
        } while (i < 5);

        // For loop
        for (int j = 0; j < 10; j++) {
            System.out.println(j);

        }
        int[] numArray = { 1, 2, 3, 4, 5 };
        for (int num : numArray) {
            System.out.println(num);
        }

        // contunie = jump the step
    }

}
