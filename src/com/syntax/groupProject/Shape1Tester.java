package com.syntax.groupProject;

public class Shape1Tester {
    public static void main(String[] args) {
        Shape[] shape={new Circle1(), new Square()};
        for(Shape shape1:shape){
            shape1.calculateArea();
            shape1.calculatePerimeter();
        }
    }
}
