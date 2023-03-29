package androidJava;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey there Welcome to Guess the Number between 0 to 20...!");
//        Thread.sleep(1000);
        System.out.print("Please Enter Your Name:  ");
        System.out.println();
        String name = sc.next();
        System.out.println("Hello "+ name);
        System.out.println("Do you want to play game Press y/Y and for no n/N");
        String ask = sc.next();
        if(ask.equals("Y") || ask.equals("y")) {
            Random rand = new Random();
            int randNum = rand.nextInt(20) + 1;
            int i = 0;
            while (i < 5) {
                System.out.print("Enter the number... ");
                System.out.println();
                int guessNum = sc.nextInt();
                if (guessNum < randNum) {
                    System.out.println("Guess the higher number than " + guessNum);
                } else if (guessNum > randNum) {
                    System.out.println("Guess the lower number than " + guessNum);
                } else {
                    System.out.println("You Won...! :)        Correct Guess after "+i+" Guesses");
                    System.out.println("Do you want to try again if yes press Y/y or else any key");
                    String askagain = sc.next();
                    if(askagain.equals("y")||askagain.equals("y")) {
                        i = 0;
                        randNum = rand.nextInt(20)+1;
                    }
                    break;
                }
                i++;
                if (i == 5) {
                    System.out.println("Better Luck Next Time...! :|");
                    System.out.println("************* Game Over :( ************");

                    System.out.println("Do you want to try again if yes press Y/y or else any key");
                    String askagain = sc.next();
                    if(askagain.equals("y")||askagain.equals("y")) {
                        i = 0;
                        randNum = rand.nextInt(20)+1;
                    }
                }
            }

        }
        else{
            System.out.println("See you then....:)");
        }
    }
}
