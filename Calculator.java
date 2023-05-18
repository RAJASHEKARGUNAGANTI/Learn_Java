package com.company.Learn_Java;

public class Calculator {
    int result = 0;
    void addition (int a , int b){
        result = a+b;
        System.out.println(result);
    }
    void substract(int a , int b){
        result = a-b;
        System.out.println(result);
    }

}
class ScinCalculator extends Calculator{
    void square (int a){
        result = a*a;
        System.out.println(result);
    }

    public static void main(String[] args) {
        ScinCalculator s = new ScinCalculator();
        s.square(4);
        s.addition(2,5);
    }
}

class Student{
    void takeTest(){
        ScinCalculator s = new ScinCalculator();
        s.addition(67,87);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.takeTest();
    }
}

class Square{
    int d1, area;
    Square(int d1){
        this.d1 = d1;
    }
    void findArea(){
        area = d1 * d1;
        System.out.println(area);
    }
    void display_dimention(){
        System.out.println(" d1 = " + d1);
    }
}
class Rectangle extends Square{
    int d2 ;
    Rectangle(int d1, int d2) {
        super(d1);
        this.d2 = d2;
    }
    void findArea(){
        area = d1 * d2;
        System.out.println(area);
    }
    void display_dimention(){
        super.display_dimention();
        System.out.println("d2 is =" + d2);
    }
}

// During inheritance if you call child obj it will internally call the parent obj.
class TestArea{
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4,6);
        r.display_dimention();
        r.findArea();
        Square s = new Square(4);
        s.findArea();
    }
}
