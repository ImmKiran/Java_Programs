package kiran.com;

import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {
        System.out.println("Enter a no.: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        while (num!=0){
           sum=sum+num%10;
           num=num/10;
        }
        System.out.println("The sum of your entered digits is "+sum);
    }
}
