package com.company.Learn_Java;

public class Contact {
    long num;
    String name;
    Contact(long num, String name){
        this.name = name;
        this.num = num;
    }
    Contact(long num){
        name = "";
        this.num = num;
    }
    Contact( String name){
        this.name = name;
        this.num = 0;
    }

    public static void main(String[] args) {
        Contact c1 = new Contact(9000666666l, "TechLearn"); //constructor overloading
        Contact c2 = new Contact(9000666666l);
        Contact c3 = new Contact("TechLearn");
    }
}
