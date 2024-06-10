package mx.com.jacademy.collections.list;

import java.util.LinkedList;

public class LinkedListExample {
    
    // Specific methods for Linked List
    public static void main(String[] args) {
        
        LinkedList linkedList = new LinkedList();

        linkedList.add("dog");
        linkedList.add("dog");
        linkedList.add("cat");
        linkedList.add("horse");

        System.out.println("Original list:"+linkedList);

        linkedList.addFirst("Tiger");
        linkedList.addLast("Elephant");
        System.out.println("\nNew first and last elements:"+linkedList);
    
        System.out.println("\nFirst element:"+linkedList.getFirst());
        System.out.println("Last element:"+linkedList.getLast());

        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("\nAfter removing first and last elements:"+linkedList);
    }
}
