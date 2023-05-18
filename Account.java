package com.company.Learn_Java;

public class Account {
    long accNo;
    int pin;
    String userName;
    String password;

    Account(long accNo, int pin){
        this.accNo = accNo;
        this.pin = pin;
    }
    Account(String userName, String password){
        this.userName = userName;
        this.password = password;
    }
    void login(long anum,int pinNO){
        if(anum == accNo && pinNO == pin ){
            System.out.println("Valid login");
        }
        else{
            System.out.println("Invalid login");
        }
    }
    void login(String name, String pss){
        if(name.equals(userName) && pss.equals(password) ){
            System.out.println("Valid login");
        }
        else{
            System.out.println("Invalid login");
        }
    }
    public static void main(String[] args) {
        Account a1 = new Account(987654326543l,1919);
        Account a2 = new Account("Rajashekar", "raja@123");
        a1.login(987654326543l,1919);
        a2.login("dfjgashdgja","jjhgjhgjh");

    }

}
