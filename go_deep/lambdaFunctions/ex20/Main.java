package com.example.github.lambdaFunctions.ex20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static class Student {
        private String name, SClass;

        private int age;

        public Student(String name,
                       int age,
                       String SClass) {
            this.name = name;
            this.age = age;
            this.SClass = SClass;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getSClass() {
            return SClass;
        }
    }

    public static void main(String[] args) {
        // Create a list of objects
        List<Student> student_list = new ArrayList<>();
        student_list.add(new Student("Adriana Jamie", 15, "X"));
        student_list.add(new Student("Felix Uisdean", 15, "X"));
        student_list.add(new Student("Conceicao Palmira", 14, "X"));
        student_list.add(new Student("Jair Camila", 14, "X"));
        student_list.add(new Student("Micaela Rosana", 15, "X"));

        // Student details
        System.out.println("Student details:");
        student_list.forEach(Student -> System.out.println(Student.getName() + " - " + Student.getAge() + " - " + Student.getSClass()));

        student_list.sort(Comparator.comparing(Student::getName));

        student_list.forEach(Student -> System.out.println(Student.getName() + " - " + Student.getAge() + " - " + Student.getSClass()));


    }
}
