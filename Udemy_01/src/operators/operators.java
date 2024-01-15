package operators;

public class operators {
    public static void main(String[] args) {
        int a = 4, b = 4, r = 3;
        int g = r;
        a = a * 2;
        g++;

        int x = 4;
        int y = x++; // y = 4 x = 5 Post increment
        y = ++x; // y = 6 y = 6 Pre increment
    }

}
