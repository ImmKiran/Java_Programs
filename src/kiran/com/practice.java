package kiran.com;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        System.out.println("what is your name");
        Scanner sc= new Scanner(System.in);
                String name= sc.next();
        System.out.println("hello " + name + " have a good day");
        System.out.println("enter km");
        Scanner s =new Scanner(System.in);
        float km = sc.nextFloat();
        float mi =km*1000;
        System.out.println(km +"kilometer is equal to "+ mi +" meter");

    }
}
