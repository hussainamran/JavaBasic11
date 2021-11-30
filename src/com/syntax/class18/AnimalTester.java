package com.syntax.class18;

public class AnimalTester {
    public static void main(String[]args){
        Dog dog=new Dog();
        dog.name="boby";
        dog.bark();
        dog.eat();

        cat ca=new cat();
        ca.name="texy";
        ca.meow();
        System.out.println(dog.name);
    }
}
