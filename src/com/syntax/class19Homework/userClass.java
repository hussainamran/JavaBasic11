package com.syntax.class19Homework;

public class userClass {
    /*
    Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
    Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
    Print users name, mobile number and address in userDetails method. Test your code.
     */
    String name;
    String number;

    userClass(String name, String number) {
        this.name = name;
        this.number = number;
    }
}

class userInfo extends userClass {
    String address;

    userInfo(String name, String number, String address) {
        super(name, number);
        this.address = address;
    }

    void userDetails() {
        System.out.println("Username is " + name + " phone number is " + number + " address is " + address);
    }

    public static void main(String[] args) {
        userInfo ad = new userInfo("Robert", "123-212-1232", "1234 Hillside Rd");
        ad.userDetails();
    }

}



