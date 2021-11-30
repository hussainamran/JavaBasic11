package com.syntax.class18Homework;

public class Tesk2 {
    /*
    Write program to inherit class A that has method printF
    which is static and call or reuse that method into class B
     */
    public static void main(String[] args) {
        E.printF();
    }

}
class D{
    static void printF(){
        System.out.println("printF from A");
    }
}
class E extends D {

}
