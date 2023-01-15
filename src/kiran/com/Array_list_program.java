package kiran.com;
import java.util.ArrayList;
import java.util.List;

public class Array_list_program {
    public static void main(String[] args) {
       List<Integer> arrayList=new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(2,33);
        arrayList.remove(1);
            System.out.println(arrayList);
    }
}
