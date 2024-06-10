package mx.com.jacademy.collections.set;

import java.util.HashSet;

public class HashSetOperations {
    
    public static void main(String[] args) {
        
        HashSet <Integer> hashSet = new HashSet<Integer>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);

        System.out.println("HashSet:"+hashSet);
    
        HashSet <Integer> subSet = new HashSet<Integer>();
        subSet.add(3);
        subSet.add(4);
        subSet.add(5);

        System.out.println("SubSet:"+subSet);

        // Union
        hashSet.addAll(subSet);
        System.out.println("\nUnion:"+hashSet);

        // Difference
        hashSet.removeAll(subSet);
        System.out.println("Difference:"+hashSet);

        // Intersection
        // Adding elements again for intersection test
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);

        subSet.add(3);
        subSet.add(4);
        subSet.add(5);
        hashSet.retainAll(subSet);
        System.out.println("Intersection:"+hashSet);
    }
}
