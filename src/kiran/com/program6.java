package kiran.com;

import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {
        System.out.println("Enter your no. :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for (int i=2;i<=n;i++){
            if (n%i==0){
                count++;
            }
        }
        if (count>1){
            System.out.println("This no. is not a prime");
        }
        else {
            System.out.println("The no. is a prime no.");
        }
    }
}
