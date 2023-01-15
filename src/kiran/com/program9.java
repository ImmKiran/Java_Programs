package kiran.com;

public class program9 {
    public static void main(String[] args) {
        int[]arr={18,23,53,12,87,56,23,56};
//        int max=arr[0];
//        for (int element:arr) {
//            if(element>max){
//                max=element;
//            }
//        }
//        System.out.println("The maximum element in this array is "+max);
        int min=arr[0];
        for (int element:arr) {
            if (element<min){
                min =element;
            }
        }
        System.out.println("The minimum element in the array is "+min);
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println("The duplicate elements found in the array and this is "+ arr[j]);
                }
            }
        }
    }
}
