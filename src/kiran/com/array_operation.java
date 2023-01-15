package kiran.com;

public class array_operation {
    public static void main(String[] args) {
        int []arr={20,40,2,250,5};
          int max=0;
        for ( int e:arr) {
            if (e > max) {
                max = e;
            }
        }
            System.out.println( "The maximum no. is "+ max);
        // Find minimum no.
        int min=arr[0];
        for (int f:arr) {
            if(f<arr[0]){
                min=f;
            }
        }
        System.out.println(min);
    }
}