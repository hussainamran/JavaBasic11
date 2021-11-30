package com.syntax.class241;

public interface Person {
    void eat();
    void sleep();
}
interface Employee{
    void work();
}
interface SyntaxEmployees extends Employee,Person{
    void teach();
}
class SDETInstructor implements SyntaxEmployees{
    @Override
    public void eat() {
        System.out.println("Syntax employee sleeping");
    }

    @Override
    public void sleep() {
        System.out.println("Syntax employee sleeping");
    }

    @Override
    public void work() {
        System.out.println("Creating new repls");
    }

    @Override
    public void teach() {
        System.out.println("Syntax employee tech IT");
    }
}