package kiran.com;

import java.util.Scanner;

public class program13 {
    public static void main(String[] args) {
        System.out.println("Enter the string :");
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        int count=1;
        for (int i=0;i<st.length()-1;i++){
            if ((st.charAt(i) == ' ')&&(st.charAt(i+1)!=' ')){
                count++;
            }
        }
        System.out.println("the words in your string is "+ count);
    }
}
