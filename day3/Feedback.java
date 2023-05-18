package com.company.Learn_Java.day3;

import java.sql.SQLOutput;

public class Feedback  {
    String name = "Unanimus";
    int rat;
    String com = "Happy to use..!";
    Feedback(String name,int rat , String com){
        this.name = name;
        this.rat = rat;
        this.com = com;
    }
    Feedback(String name , int rat){
        this.name = name;
        this.rat = rat;
//        com = "Happy to use..!";
    }
    Feedback(int rat , String com){
//        name = "Unaminus";
        this.rat = rat;
        this.com = com;
    }
    Feedback(int rat){
        this.rat = rat;
    }

    public static void main(String[] args) {
        Feedback f1 = new Feedback("Raja",5,"Supper");
        System.out.println(f1.name);
        for(int i = 0; i< f1.rat; i++){
            System.out.print("* ");
        }
        System.out.println();
        System.out.println(f1.com);
    }
}
