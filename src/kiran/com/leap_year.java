package kiran.com;
import java.util.Scanner;
public class leap_year {
    public static void main(String[] args) {
        System.out.println("enter year");
        Scanner sc= new Scanner(System.in);
        int year=sc.nextInt();
//        int year=1900;
        if(year%100==0) {
            if (year % 400 == 0) {
                System.out.println("this year is a leap year");
            }
        }
        else if (year%4==0) {
                System.out.println("this is a leap year");
            }
           else {
            System.out.println("this is not a leap year");
        }

    }
}
