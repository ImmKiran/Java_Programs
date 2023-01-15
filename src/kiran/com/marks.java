package kiran.com;
import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your physics mark:");
        int physics = scan.nextInt();
        System.out.println("enter your english mark");
        int english =scan.nextInt();
        System.out.println("enter computer mark");
        int computer= scan.nextInt();
        float percentage = ((physics+computer+english)/3);
        System.out.println("percentage is" +percentage);
    }
}
