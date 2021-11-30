package com.syntax.class241.interfacedemo;

public interface Interface {
    default void method1(){
        System.out.println("I am a default method in interface");
    }
    static void method2(){
        System.out.println("I am a static method in interface");
    }
}
class Test implements Interface{

}
class Main{
    public static void main(String[] args) {
        Interface.method2();
        //Interface.method1(); not allowed for default method
        Interface I1=new Test();
        I1.method1();
        new Test().method1();
    }
}