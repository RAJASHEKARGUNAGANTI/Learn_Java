package com.company.Learn_Java.day4;

import java.util.HashSet;

public class HashsetExp {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(4);
        hs.add(23);
        hs.add(24);
        hs.add(77);
        hs.add(77);
        hs.add(null);
        hs.add(1);
        System.out.println(hs);
        hs.clone();//  ...?
        System.out.println(hs);
    }
}
