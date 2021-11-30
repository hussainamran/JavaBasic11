package com.syntax.class21Overridingmathods;

public class MethodOverlodingDemo {
    void method(int number) {
        System.out.println(number);
    }
    void method(int number,String name) {
        System.out.println(name);
    }
// we can not overload by just changing the access modifier
/*  public  void method(int number) {
        System.out.println(number);
    }*/

    // we can not overload by just changing the access modifier
   /* static void method(int number) {
    System.out.println(number);
}

//we can not overlode by just changing the return type
    /*int method(int number) {
        System.out.println(number);
    }*/

}