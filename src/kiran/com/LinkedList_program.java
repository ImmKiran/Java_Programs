package kiran.com;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_program {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();//-->Both character and integer are used
        list.add(3);
        list.add(5);
//        list.add(3,"c");   --> can't assign linked_list in this way
        list.add(5);
        list.remove(2);
        System.out.println(list);
    }
}
