package com.syntax.class21Overridingmathods;

public class Parent {
     void method(int num){
        System.out.println("from parents class");

    }
}
 class Child extends Parent{
     @Override
      void method(int num) {
         System.out.println("From child class");
     }

 }


