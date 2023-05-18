package com.company.Learn_Java;

public class Atm {
    private int pin = 1919;
    String useName ;
    Atm(String userName){
        this.useName = userName;
    }
    void pinChange(int cpin){
        pin = cpin;
        System.out.println("Pin change successfully");
    }
    void login(String name, int vpin){
        if(name.equals(useName) && vpin == pin){
            System.out.println("Login Successfull");
        }
        else{
            System.out.println("Invalid Login ");
        }
    }


    public static void main(String[] args) {
        Atm a = new Atm("Raja");
        a.login("Raja",1919);
        a.pinChange(1002);
//        System.out.println(a.useName + " pin as changed as "+a.pin + " successfully");
        a.login("Raja",1919);
        a.login("Raja",1002);
    }
}
