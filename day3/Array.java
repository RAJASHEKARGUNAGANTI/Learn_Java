package com.company.Learn_Java.day3;

import java.util.ArrayList;
import java.util.Iterator;

// Utility function of arrayList
public class Array {
    static ArrayList a = new ArrayList();

    public static void main(String[] args) {
        Array a1 = new Array();
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
