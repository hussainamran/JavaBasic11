package com.syntax.class20;

public class MethodOverloding2Tester {
    public static void main(String[] args) {
        MethodOverloding2.add(10,10);
        MethodOverloding2.add(12,10.0);
        MethodOverloding2.add(12,12,23);
        MethodOverloding2.add(12.12,23.21);
        int[]arr={10,50,40};
        MethodOverloding2.add(arr);

        //MethodOverloding2.add(12,12,12,12,12);
        MethodOverloding2.add(12,21);

    }
}
