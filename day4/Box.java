package com.company.Learn_Java.day4;

import java.util.Comparator;
import java.util.TreeSet;

public class Box {
    int length, weight;
    String color;
    Box(int length, int weigth, String color){
        this.length = length;
        this.weight = weigth;
        this.color = color;
    }
    public String toString(){
        return length+ " "+ weight + " " + color;
    }
}
class WeightComparing implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Box b1 = (Box) o1;
        Box b2 = (Box) o2;
        if(b1.weight > b2.weight){
            return 1;
        }else if(b1.weight < b2.weight){
            return -1;
        }
        return 0;
    }
}
class CompareColor implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Box b1 = (Box) o1;
        Box b2 = (Box) o2;
        return b1.color.compareTo(b2.color);
    }
}
class TestWeigthComp{
    public static void main(String[] args) {
        WeightComparing w = new WeightComparing();
        CompareColor c = new CompareColor();
        Box b1 = new Box(5,4,"red");
        Box b2 = new Box(8,2,"green");
        Box b3 = new Box(98,9,"blue");
        TreeSet t = new TreeSet<>(w);
        TreeSet t2 = new TreeSet(c);
        t.add(b1);
        t.add(b2);
        t.add(b3);
        t2.add(b1);
        t2.add(b2);
        t2.add(b3);
        System.out.println(t);
        System.out.println(t2);
    }
}
