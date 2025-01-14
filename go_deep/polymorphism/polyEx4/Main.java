package com.example.demo.polyEx;

public class Main {
    public static void main(String []args){
//        Manager manager = new Manager("manager name",100,23);
//        Programmer programmer = new Programmer("Programmer name",80,20);
//        String managerName = manager.getName();
//        double managerSalary = manager.calculateSalary();
//        System.out.println(managerName);
//        System.out.println(managerSalary);
//        System.out.println(programmer.getName() + programmer.calculateSalary());

         String name = "Mr. Altman";
         String role = "Tester";
         double baseSalary = 3000;
         double bonus = 250;

        EmployeeFactory employee1 = new EmployeeFactory(name,role,baseSalary,bonus);
        System.out.println("employee1 name: "+employee1.getName());
        System.out.println("employee1 role: "+employee1.getRole());
        System.out.println("employee1 salary: "+employee1.calculateSalary());
    }
}
