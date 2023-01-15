package kiran.com;

import java.util.TreeMap;

public class TreeMap_program {
    public static void main(String[] args) {
        TreeMap<String,Integer>Tree=new TreeMap<>();
//        Tree.put(1,"a");
//        Tree.put(3,"d");
//        Tree.put(2,"c");    //--> This applicable if Integer written in first
        Tree.put("c",2);
        Tree.put("b",4);
        System.out.println(Tree);
        System.out.println(Tree.get("a"));   //--> Return null if not present
        System.out.println(Tree.get("c"));
        System.out.println("The size is "+ Tree.size());
        for (String tree:Tree.keySet()) {
            System.out.println(tree +"="+ Tree.get(tree));

        }
    }
}
