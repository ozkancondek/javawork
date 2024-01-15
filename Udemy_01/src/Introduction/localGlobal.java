package Introduction;

public class localGlobal {
    // Global variables are accessible from everywhere. They can be method, loop,
    // object vb.
    static int globalVariable = 8;

    public static void main(String[] args) {
        int hereIsMyLocalVariable = 7;
        // code here cant use hereIsMyLocalVariable
        globalVariable += 1;
        for (int i = 0; i < 9; i++) {
            int localInLoop = 4;
            hereIsMyLocalVariable = +1;
        }
    }

}
// A block of code refers to all of code between curly braces