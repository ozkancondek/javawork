package com.example.github.lambdaFunctions.ex1;

public class Main {
    public static void main(String[]args){
        SumCalculator sumCalculator = (x,y) -> x+y;
        int res = sumCalculator.sum(7,6);
        System.out.println(res);
    }
}
