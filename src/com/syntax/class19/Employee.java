package com.syntax.class19;

public class Employee {

    String name;
    int age;
    int baseSalary = 3000;
    int baseNoDayOff = 20;

    void printSalary() {
        System.out.println(baseSalary);
    }

    void printNoDaysOff() {
        System.out.println(baseNoDayOff);
    }
}
class Manger extends Employee{
    int bouns=10;
    int travelingAllowence=200;
    void printSalary(){
        super.printSalary();
        System.out.println(bouns+travelingAllowence);
    }

}