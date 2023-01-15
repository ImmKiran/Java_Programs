package kiran.com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
//import java.util.Set;

public class hashSet_duplicate {
    public static void main(String[] args) {
        int[] a =new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements");
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        for (int j : a) {
            set.add(j);
        }
        System.out.println(Arrays.toString(set.toArray(new Integer[set.size()])));;
    }
}
