package Arrays;

import java.util.Arrays;
import java.util.Random;

public class Array_03 {
    // Array methods
    public static void main(String[] args) {
        // Sort
        // Create an array and assign random numbers to each index

        int myNUms[] = new int[10];
        for (int i = 0; i < myNUms.length; i++) {
            Random rnd = new Random();

            int num = rnd.nextInt(50) + 1;
            myNUms[i] = num;

        }
        // Sort them now
        Arrays.sort(myNUms);

        // Contain ?
        boolean hasMyArray5 = Arrays.asList(myNUms).contains(5);
        // indexof
        int whereIs5 = Arrays.asList(myNUms).indexOf(5);

        // clone an array
        int clonedArray[] = myNUms.clone();
        // same values at the same index but they have different places in memory so
        // they not equal

        System.out.println(Arrays.toString(myNUms));
        System.out.println(hasMyArray5);
        System.out.println(whereIs5);
    }

}
