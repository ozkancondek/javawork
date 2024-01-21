package Arrays;

import java.util.Arrays;

public class Array_01 {
    public static void main(String[] args) {
        // Defining an array
        int[] numbers = new int[5]; // 5 here is length of the array
        float numbersF[] = new float[6];
        double numbersD[] = new double[3];
        String stringArray[] = new String[3];
        // Defining array from the class
        Array_02 products[] = new Array_02[3];
        // and now lets create objcets
        Array_02 product1 = new Array_02("tshirt", "sport", 50);
        Array_02 product2 = new Array_02("shoe", "sport", 54);
        // Add objects to array
        products[0] = product1;
        products[1] = product2;

        // see my array

        System.err.println(Arrays.toString(products));

        // multidimensional arrays

        int[][] myMulti = new int[2][3];
        int[][] myMulti2 = { { 1, 2, 3 }, { 4, 5, 6 } };
        myMulti2[0][1] = 5;

    }
}
