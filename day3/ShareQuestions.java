// explains synchronization and multi threading
package com.company.Learn_Java.day3;
import java.util.ArrayList; //we have add get functions
import java.util.TreeMap;

public class ShareQuestions {
//    String [] qes = new String[3];
    ArrayList<String> qes = new ArrayList<>();
//    int counter = 0;
    void addQuestion(String q){
        qes.add(q);
    }
    synchronized void displayQuestions(){ // synchronization of method

        for(int i = 0; i < qes.size(); i++){
            System.out.println(qes.get(i));
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
// Student has aquestion paper
class Student implements Runnable {
    String name;
    ShareQuestions p ;//= new ShareQuestions();
    Student(String name, ShareQuestions p){
        this.name = name;
        this.p = p;
    }

    @Override
    public void run() {
        synchronized (this){
            p.displayQuestions();
        }
    }
}
class TestQp{
    public static void main(String[] args) {
        ShareQuestions python = new ShareQuestions();
        python.addQuestion("What is python ?");
        python.addQuestion("Is python scripting language ?");
        python.addQuestion("What are genarators in pythin ?");
        python.addQuestion("Is global key word found in python ?");
//        python.displayQuestions();
        Student s  = new Student("Raja",python);
        Student s2 = new Student("ramesh",python);
        Thread t1 = new Thread(s);
        Thread t2  = new Thread(s2);
        t1.start();
        t2.start();
    }
}
