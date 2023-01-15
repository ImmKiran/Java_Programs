package kiran.com;

import java.util.Scanner;
import java.util.Random;

public class games {
    public static void main(String[] args) {
        System.out.println("enter 1 for rock, 2 for paper or 3 for scissor");
        Scanner sc = new Scanner(System.in);
        int input=sc.nextInt();
        Random number =new Random();
        int computer = number.nextInt();
        if (input==computer){
            System.out.println("draw");
        } else if (input==1 && computer==2 || input==2 && computer==3|| input==3 && computer==1) {
            System.out.println("you lost");
        }
        else {
            System.out.println("you won");
        }
    }
}
