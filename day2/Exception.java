package com.company.Learn_Java.day2;

abstract class User{
    int a  =99;
}

public class Exception {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //NegativeArraySizeException
//        int[] arr ;
//        arr = new int[-1];
//        System.out.println(arr);

        // NumberFormatException
//        int a = Integer.parseInt("asdf");
//        System.out.println(a);

        // NullPointerException
//        String s1 = null;
//        String s2 = "Hello";
//        System.out.println(s1.equals(s2));

        // ClassNotFoundException
        Class ref = Class.forName("User");
        Object obj = ref.newInstance();
        User u1 =(User)obj;
        System.out.println(u1.a);
    }
}

