package com.syntax.class20;

public class Task4 {
    /*
    Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */
    private void method() {
        System.out.println("void mathod");
    }

    private int method(int num) {
        System.out.println("int mathod");
        return num;
    }

    private int method(String str) {
        System.out.println("String mathod");
        return 5;
    }

    public static void main(String[] args) {
        Task4 tesk4=new Task4();
        tesk4.method("18");
    }
}