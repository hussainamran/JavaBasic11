package com.syntax.class21Overridingmathods.Homework;

public class Student {
    /*Create a Class Student that will have 3 subclasses as SyntaxStudent,
CollegeStudent, SchoolStudent. Define common behavior within parent class
 and override some of the methods in child classes
 Define some methods specific to child classes
 Write example of achieving run time polymorphism*/
    void study(){
        System.out.println("Students must study");
    }
    void doHomeWork(){
        System.out.println("Students must do homework");
    }
    void practice(){
        System.out.println("Students must practice");
    }
}
class SyntaxStudent extends Student{
    @Override
    void study(){
        System.out.println("Students must study 25 hours a week");
    }
    @Override
    void doHomeWork(){
        System.out.println("Students must solve repls");
    }

    void doResearch(){
        System.out.println("Syntax student do additional research");
    }
}
class CollegeStudent extends Student{
    @Override
    void doHomeWork(){
        System.out.println("College student must do homework");
    }
}
class SchoolStudent extends Student {

}