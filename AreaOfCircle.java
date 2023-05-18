package com.company.Learn_Java;

public class AreaOfCircle {
   String un = "Raja";
   String pass = "123";
   void login(String s1, String s2){
        if(un.equals(s1) && pass.equals(s2)){
            System.out.println("Login Success");
        }
        else
        System.out.println("Login Failed");
    }
    public static void main(String[] args) {
       AreaOfCircle a = new AreaOfCircle();
        a.login("Raja", "123");
        a.login("Raja", "1223");
    }
}
