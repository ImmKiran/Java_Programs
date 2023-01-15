package kiran.com;

import java.util.Scanner;

public class program8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length");
        int n=sc.nextInt();
        System.out.println("Enter array elements");
        int[]arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int sum2=0;
        for (int j : arr) {
            sum = sum + j;
        }
        System.out.println("The total sum of the array is "+sum);
        for (int i=1;i<=n+1;i++){
            sum2=sum2+i;
        }
        System.out.println("sum of the total no. is "+sum2);
        System.out.println("The missing elements in the array is "+(sum2-sum));
    }

}
