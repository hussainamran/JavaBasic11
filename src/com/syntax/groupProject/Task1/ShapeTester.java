package com.syntax.groupProject.Task1;

public class ShapeTester {
    public static void main(String[] args) {
        Shape[] shape={new Circle1(), new Square()};
        for(Shape shape1:shape){
            shape1.calculateArea();
            shape1.calculatePerimeter();
        }
    }

}
