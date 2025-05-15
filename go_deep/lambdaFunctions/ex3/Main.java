package com.example.github.lambdaFunctions.ex3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void printarrayElements(List<String> stringList){
        for (String str : stringList) {
            System.out.println(str);
        }
    }

    public static void convertToCase(List<String> stringList, boolean caseState){
        stringList.replaceAll(str -> caseState ? str.toUpperCase() : str.toLowerCase());
    }
    public static void main(String[] args){
        // Create a list of strings
        List stringList = Arrays.asList("Red", "Green", "Blue", "PINK");
        printarrayElements(stringList);
        convertToCase(stringList,true);
        printarrayElements(stringList);



    }
}
