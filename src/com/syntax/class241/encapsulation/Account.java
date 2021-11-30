package com.syntax.class241.encapsulation;

public class Account {
    private String name;
    private String userName;
    private String password;
    private double balance=1000;

    Account(){

    }
    public Account(String name, String userName, String password, double balance){
        setName(name);
        setPassword(password);
        setUserName(userName);
        setBalance(balance);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()<20){
            this.name = name;
        }else {
            System.out.println("Not allowed");
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 0) {
            this.balance = balance;
        }else{
            System.out.println("Negative value is not allowed");
        }
    }
}
