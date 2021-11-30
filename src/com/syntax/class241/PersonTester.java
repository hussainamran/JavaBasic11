package com.syntax.class241;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new SDETInstructor();
        person.eat();
        person.sleep();
        /*person.teach(); we can not do that we can not called child class object in parents object
        person.eork();*\
         */

        Employee employee=new SDETInstructor();
        employee.work();

        SyntaxEmployees syntaxEmployees=new SDETInstructor();
        syntaxEmployees.teach();
        syntaxEmployees.eat();
        syntaxEmployees.work();
        syntaxEmployees.sleep();

        SDETInstructor sdetInstructor=new SDETInstructor();
        sdetInstructor.teach();
        sdetInstructor.eat();
        sdetInstructor.work();
        sdetInstructor.sleep();
    }
}
