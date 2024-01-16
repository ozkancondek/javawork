package oop;

public class MethodOverloading {
    // same methodswith same names different functions in the same class
    // the are not exactly th same and shouldnt be copy
    // parameter count, parameter order, parameter types can be different

    public void delete(int id, String name) {
        System.out.println(id + " is deleted with" + name);
    }

    public void delete(int age) {
        System.out.println(age + " is deleted without name");
    }

    // same methods but different parameter
    // We call it method overloading
}
