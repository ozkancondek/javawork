package algorithms;

public class algorithm_1 {
    public static void main(String[] args) {
        squareBuilder(10);
    }

    public static void starBuilder(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void squareBuilder(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print("  *");
            }
            System.out.println();
        }
    }
}
