package kiran.com;
import java.util.Scanner;

public class practice2 {
    //write a program to encrypt a grade by adding 8 to it and decrypt it
    public static void main(String[] args) {
        char grade ='B';
        grade =(char)( grade+8);
        System.out.println(grade);

        //decrypt the grade
        grade = (char)(grade-8);
        System.out.println(grade);

        //Write a pg. to show the given no. is greater than user defined no.
        System.out.println("write a no.");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a>8);
    }
}
