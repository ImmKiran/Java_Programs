package kiran.com;

import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        System.out.println("Enter a no.: ");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int rem=0;
        int evenCount=0;
        int oddCount=0;
        while (num!=0){
            rem=num%10;
            if (rem%2==0){
                evenCount++;
            }
            else {
                oddCount++;
            }
            num=num/10;
        }
        System.out.println("The even digits in your number is "+evenCount+" and the odd digits of your number is "+oddCount);
    }
}
