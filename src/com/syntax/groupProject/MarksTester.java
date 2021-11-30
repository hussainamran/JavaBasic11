package com.syntax.groupProject;

public class MarksTester {
    public static void main(String[] args) {
        A a=new A(89,89,78);
        a.getPercentage();
        B b=new B(78,89,79,89);
        b.getPercentage();

        Marks []marks={new A(89,89,78),new B(78,89,79,89)};
        for(Marks marks1:marks){
            marks1.getPercentage();
        }
    }
}
