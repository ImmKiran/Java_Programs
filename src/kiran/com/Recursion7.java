package kiran.com;

public class Recursion7 {
    static void sumOfEvenR(int[] arr,int i,int sum){
        if(i<0) {
            System.out.println(sum);
            return;
        }
//        if(arr[i]%2==0) {
            sum += arr[i];
//        }
        sumOfEvenR(arr,i-1,sum);
    }
    public static void main(String[] args) {
        int[] arr={10,23,12,23,4,4};
        int n= arr.length;
        int sum=0;
        sumOfEvenR(arr,n-1,sum);
    }
}
