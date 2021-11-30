package com.syntax.Mehtodoveride;

public class Parent {
    String name="Sedat";
    void printName(){
        System.out.println("name is "+name);
    }
    void getMarried(){
        System.out.println("Ahmet will get married by my choice");
    }
}
class Child extends Parent{
    String name="Ahmet";
    void printName(){
        String name="Sharif";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
    @Override
    void getMarried() {
        System.out.println("But i like someone else");
        super.getMarried();
    }
    void letsDoSomethingCrazy(){
        super.getMarried();
        getMarried();

    }

    public static void main(String[] args) {
        Child child=new Child();
        child.letsDoSomethingCrazy();

    }
}
