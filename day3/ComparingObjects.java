package com.company.Learn_Java.day3;

public class ComparingObjects {
    int marks;
    ComparingObjects(int marks){
        this.marks = marks;
    }
    int compareMarks(Student other){
//        if(this.marks > other.marks) return 1;
//        else if(this.marks < other.marks) return -1;
        return 0;
    }

}
class TestMarks{
    public static void main(String[] args) {
        ComparingObjects c1 = new ComparingObjects(97);
        ComparingObjects c2 = new ComparingObjects(20);

    }
}
