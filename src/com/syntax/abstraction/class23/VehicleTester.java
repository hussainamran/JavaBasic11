package com.syntax.abstraction.class23;

public class VehicleTester {
    public static void main(String[] args) {
        BMW bmw=new BMW("123xl","Sedan","BMW","X5");
        bmw.printVehicleCount();
        bmw.speed();
        bmw.drive();
        bmw.stop();

        Vehicle toyota=new Toyota("456ty","Sedan","Toyota","Yaris");
    }
}
