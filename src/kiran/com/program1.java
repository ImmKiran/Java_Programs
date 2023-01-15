package kiran.com;

import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner sc=new Scanner(System.in);
        String st =sc.nextLine();
//         String org_st= st;
         String rev="";
         for (int i=st.length()-1;i>=0;i--){
             rev=rev+st.charAt(i);
         }
         if (st.equalsIgnoreCase (rev)){
             System.out.println("this string is a palindrome string");
         }
         else {
             System.out.println("This string is not a palindrome");
         }
    }
}
