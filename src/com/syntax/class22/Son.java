package com.syntax.class22;

public class Son extends Father{
    Son(String name) {
        super(name);
    }
        void sleep(){
            System.out.println(name+" like you sleep 10 hours");
        }
        void eat(){
            System.out.println(name+" like to eat kabab");
    }
}
 class Son2 extends Father{
    Son2(String name) {
        super(name);

        }
        void eat () {
            System.out.println(name + " like to eat Fish");
        }
    }

