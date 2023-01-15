package kiran.com;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        System.out.println("Enter no. to check it's palindrome or not :");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int org_no=num;
        int rev=0;
        while (num!=0){
           rev=rev*10+num%10;
           num=num/10;
        }
        if (org_no==rev){
            System.out.println("the no. is a palindrome no.");
        }
        else {
            System.out.println("the no. is not a palindrome");
        }
    }
}
