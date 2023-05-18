//Deadlock in multi threading
package com.company.Learn_Java.day3;

// library book
public class Library {
    Book phy = new Book("Physics");
    Book che = new Book("Chemistry");
}

//student use book
class Book{
    String bname;
    Book(String name){
        this.bname = name;
    }
}
//student uses library
class PhyStudents extends Thread{
    String sname;
//    Book b;
    Library l;

    PhyStudents(String sname, Library l) {
        this.sname = sname;
//        this.b = b;
        this.l = l;
    }
    public void run(){
        synchronized (l.phy){
            System.out.println(sname+" Reading the "+ l.phy.bname + " book");
            synchronized (l.che){
                System.out.println(sname+  " Reading the " +  l.che.bname + " book");
            }
            System.out.println(sname+ " as returned" + l.che.bname + " book");
        }
        System.out.println(sname+ " as returned" + l.phy.bname + " book");
    }

}
class CheStudents extends Thread{
    String sname;
    //    Book b;
    Library l;

    CheStudents(String sname, Library l) {
        this.sname = sname;
//        this.b = b;
        this.l = l;
    }
    public void run(){
        synchronized (l.che){
            System.out.println(sname+" Reading the "+ l.che.bname + " book");
            synchronized (l.phy){
                System.out.println(sname+  " Reading the " +  l.phy.bname + " book");
            }
            System.out.println(sname+ " as returned" + l.phy.bname + " book");
        }
        System.out.println(sname+ " as returned" + l.che.bname + " book");
    }


}
class TestBook{
    public static void main(String[] args) throws InterruptedException {
        Library l = new Library();
        PhyStudents s1  = new PhyStudents("Raja",l);
        CheStudents s2 = new CheStudents("Ram",l);
        Thread t1 = new Thread(s1);
        Thread t2  = new Thread(s2);
        t1.start();
//        Thread.sleep(5000);
        t2.start();
    }

}
