package com.syntax.class19Homework;

public class Shape {
    /*
    Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    In circle class create a method to calculate the area of circle. Test your code
     */
    int radius;
    Shape(int radius){
    this.radius=radius;
    }
}
class Circle extends Shape{
    int area;
    Circle(int radius){
        super(radius);

    }
    void calculate(){
        area=(radius*radius)*314;
        System.out.println(area);
    }

    public static void main(String[] args) {
        Circle ca=new Circle(120);
        ca.calculate();
    }
}