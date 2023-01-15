package kiran.com;

import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        System.out.println("Enter a no.: ");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int count=0;
        while (num!=0){
            num=num/10;
            count++;
        }
        System.out.println("the digit of your no. is "+count);
    }
}
