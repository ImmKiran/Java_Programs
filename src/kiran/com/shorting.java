package kiran.com;
import java.util.*;

public class shorting {
    // Bubble sort
//    public static void printArray(int arr[]){
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i] +" ");
//        }
//        System.out.println();
//    }
    public static void main(String[] args) {
        int[] arr ={2,8,6,5,3};
        //bubble sort
        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr.length-1-i;j++){
            if (arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]= temp;
            }
        }
        }
        //printArray(arr);
//       for (int k=0;k<arr.length;k++){           // this is also valid
        for (int k:arr) {
           System.out.println(k);
       }


    }
}
