package com.example.github.lambdaFunctions.ex2;

import java.util.function.Predicate;

public class StringUtils {
    private String text;

    public String getText() { return text; }
    public void setText(String text) { this.text = text; }

    public boolean isEmpty() {
        Predicate<String> checkIfEmpty = str -> str.isEmpty();
        return checkIfEmpty.test(this.text);
    }
}