package com.company.Learn_Java.day4;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorsExp {
    public static void main(String[] args) {
        Vector v1 = new Vector(); // initial capacity is 10
        Vector v2 = new Vector(3);
        Vector v3 = new Vector(3,2); // capacity() size()
        v1.add(5);
        v1.add(4);
        v1.insertElementAt(3,1);
        System.out.println(v1.size() + "  "+ v1.capacity());
        v2.add(5);
        v2.add(4);
        v2.add(6);
        v2.add(7);
        System.out.println(v2.size() + "  "+ v2.capacity());
        v3.add(5);
        v3.add(4);
        v3.add(6);
        v3.add(7);
        v3.add(9);
        v3.add(89);
        v3.addElement(999);

        System.out.println(v3.size() + "  "+ v3.capacity());
        System.out.println(v3.elementAt(3));

        Enumeration e  = v1.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        Iterator it = v1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(v1.firstElement());
        System.out.println(v3.lastIndexOf(5));
    }
}
