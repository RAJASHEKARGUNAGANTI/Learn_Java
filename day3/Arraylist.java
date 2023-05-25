package com.company.Learn_Java.day3;

import java.util.ArrayList;
import java.util.Iterator;

// Utility function of arrayList
public class Arraylist {
    static ArrayList a = new ArrayList();

    public static void main(String[] args) {
        Arraylist a1 = new Arraylist();
        a1.a.add(1);
        a1.a.add(12);
        a1.a.add(145);
        Iterator it = a1.a.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        for (Object o : a){
            System.out.println(o);
        }
    }
}
