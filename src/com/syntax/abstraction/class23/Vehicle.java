package com.syntax.abstraction.class23;

public abstract class Vehicle {
    // abstract String vin_number; abstract not allowed with fields.
    String vin_number;
    static int totalVehicles;

    /*abstract  Vehicle(){
        abstract not allowed with constructors
     */
    Vehicle (String vin_number){
        totalVehicles ++;
        this.vin_number=vin_number;
        System.out.println("Grandpas constructor is called");
    }
    public void printVehicleCount(){
        System.out.println(totalVehicles+ " Vehicle creating");
    }
    public void drive(){
        System.out.println("Vehicle is driving");
    }
    public void stop(){
        System.out.println("Vehicle stopping");
    }
    public abstract void start();
}
abstract class Car extends Vehicle{
    String carType;
    Car(String carType, String vin_number){
        super(vin_number);
        this.carType=carType;
        System.out.println("Parent constructor is called");
    }

    @Override
    public void drive() {
        System.out.println("Car is driving");
    }
    public abstract void speed();
}
class BMW extends Car{
    String make;
    String model;
    BMW(String vin_number, String carType, String make, String model){
        super(carType, vin_number);
    }

    @Override
    public void speed() {
        System.out.println("BMW can run 300km/H");
    }

    @Override
    public void start() {
        System.out.println("BMW can start using remote");
    }
}
class Toyota extends Car{
    String make;
    String model;
    Toyota(String vin_number, String carType, String make, String model){
        super(carType, vin_number);
        this.make=make;
        this.model=model;
    }

    @Override
    public void start() {
        System.out.println("Toyota can start using key");
    }

    @Override
    public void speed() {
        System.out.println("Toyota can run 200km/H");
    }
    void displayInfo(){
        System.out.println("We build "+make+ " model "+model+ " carType "+carType+" "+vin_number);
    }
}