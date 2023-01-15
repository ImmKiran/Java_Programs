package kiran.com;

import java.util.HashMap;
//import java.util.Map;

public class HashMap_program {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("a",10);
        map.put("b",20);
        map.put("c",30);
        System.out.println(map);
        System.out.println("a" + "="+map.get("a"));
        System.out.println("The total size of this hashmap is " +map.size());
        for (String key:map.keySet()) {
            System.out.println( key+ "=" +map.get(key));

        }
    }
}
