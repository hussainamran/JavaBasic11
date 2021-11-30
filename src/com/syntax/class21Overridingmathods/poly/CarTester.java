package com.syntax.class21Overridingmathods.poly;

public class CarTester {
    public static void main(String[] args) {
        BMW bmw=new BMW();
        bmw.start();

        // array need to be parents type
        Car[] cars={new BMW(), new Tesla(),new Toyota()};
        for(Car car:cars){
            car.start();
            car.stop();
            car.park();
        }
    }
}
