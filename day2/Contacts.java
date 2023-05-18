package com.company.Learn_Java.day2;

//import java.util.Dictionary;
//import java.util.Hashtable;

public class Contacts {
//    Dictionary<String, Integer> dict= new Hashtable<>();
//    void addContact (String str , )
    String name ;
    long number ;
    Contacts (String name,long number){
        this.name = name;
        this.number = number;
    }
    void view(){
        System.out.println("Name is : "+name);
        System.out.println("Number is : "+number);
    }

}

class Mobile extends Contacts{

    Mobile(String name, long number) {
        super(name, number);
    }
    Contacts cList[] = new Contacts[100];
    int tot_contact = 0;

    void addContact(String nName, long nNum ){
        if(tot_contact < 100){
            cList[tot_contact].name = nName;
            cList[tot_contact].number = nNum;
            tot_contact++;
            System.out.println("New contact is added successfully");
        }
        else{
            System.out.println("Contact list is full..!");
        }
    }
    void deleteContact(String dName){
        if(tot_contact > 0){
            for(int i = 0; i <= tot_contact; i++){
                if(dName.equals(cList[i].name)){
                    cList[tot_contact] = null;
                    tot_contact--;
                    System.out.println("New contact is deleted successfully");
                    break;
                }
                else{
                    System.out.println("Contact list is empty..!");
                }
            }
        }
    }
    void search(String sName){
        if(tot_contact != 0){
            for(int i = 0; i <= tot_contact; i++){
                if(sName.equals(cList[tot_contact].name)){
                    System.out.println("Name is : "+cList[tot_contact].name);
                    System.out.println("Number is : "+cList[tot_contact].number);
                }
                else{
                    System.out.println("Contact not found..!");
                }
            }
        }
    }
    void search(long dNum){
        if(tot_contact != 0){
            for(int i = 0; i <= tot_contact; i++){
                if(dNum == (cList[tot_contact].number)){
                    System.out.println("Name is : "+cList[tot_contact].name);
                    System.out.println("Number is : "+cList[tot_contact].number);
                }
                else{
                    System.out.println("Contact not found..!");
                }
            }
        }
    }

    public static void main(String[] args) {
        Mobile m = new Mobile("raja",9998877679l);
        m.addContact("shekar",9988009988l);
        m.search("raja");
        m.search("9998877679l");
    }

}