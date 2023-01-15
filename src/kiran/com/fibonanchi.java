package kiran.com;

import java.util.Scanner;

public class fibonanchi {
    static int fib(int n){
        if(n==1|| n==2){    // if n==1 then return 0
            return n-1;     // else if n==2 return 1
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println("up to which no. series you want to see");
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(fib(n));
    }
}
