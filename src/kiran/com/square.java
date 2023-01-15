package kiran.com;

import java.util.Scanner;

public class square {
    int side;
     public int area(){
         return side*side;

     }
     public int perimeter(){
         return 4*side;
     }

    public static void main(String[] args) {
        square sq=new square();
        System.out.println("enter side of your square");
        Scanner sc = new Scanner(System.in);
         sq.side= sc.nextInt();
        System.out.println("Area of your square is "+ sq.area());
        System.out.println("perimeter of your square is "+ sq.perimeter());

    }
}
