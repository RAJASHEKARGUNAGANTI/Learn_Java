package com.company.Learn_Java.day4;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashtableExp {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(1,2);
        ht.put(9,7);
        ht.put(5,0);
        ht.put(8,0);
        System.out.println(ht);
        System.out.println(ht.get(9));
        System.out.println(ht.keySet());
        System.out.println(ht.values());
        Set s = ht.keySet();
        for(Object n : s){
            System.out.print(n+ " ");
        }
        System.out.println();
        Collection c = ht.values();
        Iterator i = c.iterator();
        while(i.hasNext()){
            System.out.print(i.next() + " ");
        }
    }
}
