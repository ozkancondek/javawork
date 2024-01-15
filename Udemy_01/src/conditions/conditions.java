package conditions;

public class conditions {
    public static void main(String[] args) {
        int x = 7;
        if (x % 4 == 1) {
            System.out.println("1");
        } else if (x % 4 == 2) {
            System.out.println("2");
        } else if (x % 4 == 3) {
            System.out.println("3");
        } else {
            System.out.println("0");
        }

        // Ternary
        String msg = x > 10 ? "bigger" : "smaller";

        // Switch case
        switch (x) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("Here is the default option");
                break;
        }
    }
}
