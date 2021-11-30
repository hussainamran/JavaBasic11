package com.syntax.groupProject;

import javafx.scene.shape.Circle;

public interface Shape {
  /*
    Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
    Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.
     */

    void calculateArea();
    void calculatePerimeter();
}
class Circle1 implements Shape {
    double r=8;
    double pie=3.14;
    @Override
    public void calculateArea() {
        System.out.println("The area of circle is: "+r*r*pie);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The perimeter of circle is: "+8*2);
    }
}
class Square extends Circle1{
    double l=10;
    double pie=3.14;
    @Override
    public void calculateArea() {
        System.out.println("The area of square is : "+l*l*pie);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The area of perimeter is : "+10*4);
    }
}

