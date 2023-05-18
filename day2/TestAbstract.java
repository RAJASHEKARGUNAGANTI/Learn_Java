package com.company.Learn_Java.day2;

abstract class Shape {
    int d1 , area ;
    Shape(int d1){
        this.d1 = d1;
        this.area = 0;
    }
    abstract void findArea();
    void displayArea(){
        System.out.println("Area is " + area);
    }
    void displayDim(){
        System.out.println("d1 = " + d1);
    }
}
class Cuboid extends Shape{
    int d2 , d3 ,vol;
    Cuboid(int d1, int d2, int d3) {
        super(d1);
        this.d2 = d2;
        this.d3 = d3;
        vol = 0;
    }

    @Override
    void findArea() {
        area = 2*(d1*d2 + d2*d3 + d3*d1);
    }
    void findVol(){
        vol  = d1 * d2 * d3 ;
    }

}
class AreaCalc{
    void printArea(Shape s) {
        s.findArea();
        s.displayArea();
    }
}
class TestAbstract {
    public static void main(String[] args) {
        Shape c1  = new Cuboid(2,3,4);
        AreaCalc c = new AreaCalc();
        c.printArea(c1);
    }
}