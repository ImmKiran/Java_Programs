package kiran.com;

import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        int a=5;
        System.out.println("enter no.to devised ");
        Scanner sc = new Scanner(System.in);
        int b= sc.nextInt();
        try{
            System.out.println("the result of a/b="+a/b);
        }
        catch(Exception e){
            System.out.println("it can't divide because : ");
            System.out.println(e);
        }
        System.out.println("you are doing well");
    }
}
