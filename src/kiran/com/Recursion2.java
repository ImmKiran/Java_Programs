package kiran.com;

public class Recursion2 {
    static void number(int x){
       if(x>10)
           return;
        System.out.println(x);
        number(x+1);
    }
    public static void main(String[] args) {
        number(1);
    }
}
