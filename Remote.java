package com.company.Learn_Java;

public class Remote {
    int temperature = 18;

    void decTemp(){
        if(temperature > 16)
        temperature--;
    }
    void incTemp(){
        if(temperature < 30)
        temperature++;
    }

    public static void main(String[] args) {
        Remote r = new Remote();
        r.decTemp();
        System.out.println(r.temperature);
        r.incTemp();
        System.out.println(r.temperature);
    }
}
