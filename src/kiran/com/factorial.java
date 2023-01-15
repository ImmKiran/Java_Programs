package kiran.com;

import java.util.Scanner;

public class factorial {
    static int facto(int x){
        if (x==0||x==1 ){
            return 1;
        }
        else {
            return x*facto(x-1);
        }
    }
     static int factorial_iteration(int n) {
         int fact = 1;
         for (int i = 1; i <= n; i++) {
             fact = fact * i;
         }
         return fact;
     }
    public static void main(String[] args) {
        System.out.println("enter the no. whose factorial you want to see");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(facto(n));
        System.out.println(factorial_iteration(n));
    }
}
