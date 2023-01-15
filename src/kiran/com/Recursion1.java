package kiran.com;

public class Recursion1 {
    static void number(int x){
        if (x==0)
            return;
        else
            System.out.println(x);
         number(x-1);
    }
    public static void main(String[] args) {
        number(10);
    }
}
