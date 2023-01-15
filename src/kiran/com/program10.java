package kiran.com;

public class program10 {
    public static void main(String[] args) {
        int[]arr={10,34,43,45,67,87,43};
        int n=43;
        for (int i=0;i< arr.length;i++) {
            if (arr[i]==n){
                System.out.println("the item found at the position "+ (i+1));
            }
        }
    }
}
