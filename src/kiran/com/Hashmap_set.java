package kiran.com;

import java.util.HashSet;
import java.util.Set;

public class Hashmap_set {
    public static void main(String[] args) {
        // int arr={10,20,30,20,40};
        Set<Integer> hashSet=new HashSet<>(); //Both integer and String
        hashSet.add(4);
        hashSet.add(5);
//        hashSet.add(4);  //--> Hashset remove duplicate elements
        hashSet.add(6);
        hashSet.remove(5);
  System.out.println(hashSet.contains(8));//-->If the element present it returns true else false
        System.out.println(hashSet);
    }
}
