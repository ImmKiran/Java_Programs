package kiran.com;

import java.util.Scanner;

public class pg1 {
    public static void main(String[] args) {
        System.out.println("Enter the no. you want to store");
        int n;
        String temp;
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        String[] name = new String[n];
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the names you want to store");
        for (int i=0;i<n;i++){
            name[i]=sc1.nextLine();
        }
        for (int j=0;j<n;j++){
            for (int k=j+1;k<n;k++){
                if (name[j].compareTo(name[k])>0){
                    temp=name[j];
                    name[j]=name[k];
                    name[k]=temp;
                }
            }
        }
        System.out.println("The sorted list is:");
        for (String names:name) {
            System.out.println(names);
        }
    }
}
