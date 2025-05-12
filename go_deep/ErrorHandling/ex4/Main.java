package com.example.github.errorHandling.ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
        static Predicate<Integer> isPositive = num -> num > 0;



        static void mapNumbers(List<Integer> list) throws Exception {
                for (Integer num : list) {
                        if (!isPositive.test(num)) {
                                throw new Exception("Negative number found: " + num);
                        } else {
                                System.out.println("Num is positive: " + num);
                        }
                }
        }

        public static void main(String[] args){
                List<Integer> liste = new ArrayList<>(Arrays.asList(1, 2,-5, 3, 4, 5, 6, 8));
                try {
                        mapNumbers(liste);
                } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                }
        }
}

