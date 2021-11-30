package com.syntax.groupProject;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {

    }
    /*
    Create Registration Class in which you would have variables as email, userName and password that have an
    access scope only within its own class. After creating an object of the class user should be able to call
    methods and in each method separately pass values to set users email, username and password.
    Requirements: Valid email consider to be only yahoo
    Valid userName and password cannot be empty and should be of length larger than 6 characters.
    Also valid password cannot contain userName.
     */
    Scanner obj = new Scanner(System.in);
    private String email;
    private String userName;
    private String password;

    private void setEmail(String email){
        this.email=email;
        email=obj.next();
        if(email.equals("yahoo")){
            System.out.println("It is a valid email address");
        }else{
            System.out.println("Invalid email address");
        }
    }
    private void setUserName(String userName){
        this.userName=userName;
        userName=obj.next();
        boolean isEmpty;
        if(userName.isEmpty()){
            System.out.println("Username field can not be empty");
        }else if(userName.equals("userName")&& userName.length()>6){
            System.out.println("valid email address");
        }else {
            System.out.println("Invalid email address");
        }
    }
    private void setPassword(String password){
        this.password=password;
        password=obj.next();
        if(password.isEmpty()){
            System.out.println("Password field can not be empty");
        }else if(password.equals("password")&& password.length()>6){
            System.out.println("Valid password");
        }else {
            System.out.println("Invalid password");
        }
    }
}
