package com.syntax.groupProject.Task1.Task3;

public class CarTester {
    public static void main(String[] args) {
        Car car = new Car(17000, "white");
        System.out.println(car.calculateSalePrice());

        Car[] cars = {new Truck(3000, "Black", 2000), new Sedan(4000, "Red", 23000)};
        for (Car car1 : cars) {
            System.out.println(car1.calculateSalePrice());
        }
    }

}
