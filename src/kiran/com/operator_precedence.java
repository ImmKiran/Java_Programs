package kiran.com;

public class operator_precedence {
    public static void main(String[] args) {
        int a = 10*5-6/3;
        int b =10/5-3*2;
        System.out.println(a);
        System.out.println(b);
         // it follows  BOD-MAS rule and left to right associativity
        //++ , = --> right to left
        // increment and decrement operator
        int i= 10;
        System.out.println(i++);
        System.out.println(i);// now i is 11 by increasing previous
        System.out.println(++i);
        //quick quiz
        int y =7;
        int x= ++y *8;
        System.out.println(x);
    }
}
