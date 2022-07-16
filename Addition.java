package Learn_Java;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter values");
        a=sc.nextInt();
        b= sc.nextInt();
        c=a+b;
        System.out.println("sum of "+a +" and "+b+" ;is " +c);
    }
}
