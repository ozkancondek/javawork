package com.example.github.lambdaFunctions.ex10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Main {

    public static String cString(String st){
        String starter = "";
        return concatenate.apply(starter,st);
    }
    static BiFunction<String, String, String> concatenate  =  (s1, s2) -> s1+s2;

    public static void main(String[] args){

        String exString = "a";
        System.out.println(cString(exString));
    }
}


