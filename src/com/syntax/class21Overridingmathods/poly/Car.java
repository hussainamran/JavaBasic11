package com.syntax.class21Overridingmathods.poly;

public class Car {
    void start(){
        System.out.println("Use keys to start me");
    }
    void stop(){
        System.out.println("Use break to stop me");
    }
    void park(){
        System.out.println("park ma manually");
    }
}
class BMW extends Car{
    @Override
    void start() {
        System.out.println("Use the button to start me");
    }
}
class Tesla extends Car{
    @Override
    void start() {
        System.out.println("Use mobile app to start me");
    }

    @Override
    void park() {
        System.out.println("Use parking sensor to park me");
    }
}
class Toyota extends Car{

}