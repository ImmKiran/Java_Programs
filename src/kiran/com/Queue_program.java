package kiran.com;

import java.util.PriorityQueue;
//import java.util.Queue;

public class Queue_program {
    public static void main(String[] args) {
        System.out.println("    Integer Queue    ");
        System.out.println("   ---------------    ");
        PriorityQueue<Integer>queue=new PriorityQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue);
        System.out.println(queue.size());
//        queue.remove(20);
        queue.remove();
        System.out.println(queue);
        System.out.println("    String Queue    ");
        System.out.println("   ---------------    ");
        PriorityQueue<String>queue2 = new PriorityQueue<>();
        queue2.add("India");
        queue2.add("Bharat");
        queue2.add("Odisha"); //-->In case of String it adds and remove elements in alphabetical order
        System.out.println(queue2);
        System.out.println("The remove element is : " + queue2.remove());
        System.out.println(queue2.peek());
        System.out.println(queue2.poll()); //-->Remove elements
        System.out.println(queue2);
    }
}
