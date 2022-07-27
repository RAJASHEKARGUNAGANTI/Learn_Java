package Learn_Java;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        int reminder,revers=0,temp;
        System.out.println("enter the number");
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        temp=number;
        while(number>0) {
            reminder = number % 10;
            revers = (revers * 10) + reminder;
            number = number / 10;
        }
        if(temp==revers)
            System.out.println(temp+" is a palindrome");
        else
            System.out.println(temp+" "+" is not a palindrome");

    }
}
