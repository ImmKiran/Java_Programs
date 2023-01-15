package kiran.com;

import java.util.TreeSet;

public class TreeSet_program {
    public static void main(String[] args) {
        TreeSet<Integer>treeSet=new TreeSet<>();
//        treeSet.add("a");
//        treeSet.add("A");
//        treeSet.add("c");   //It sorts the elements in Ascending order
//        treeSet.add("b");  //if upper case then sort upper case
//        treeSet.add("B");
        treeSet.add(9);
        treeSet.add(7);
        System.out.println(treeSet);
    }
}
