package mx.com.jacademy.collections.set;

import java.util.HashSet;

public class HashSetExample {
    
    // A collection that contains no duplicate elements
    public static void main(String[] args) {
        
        // Default capacity 16 Load Factor 0.75
        HashSet hashSet = new HashSet();

        // Add objects/elements into HashSet
        hashSet.add(100);
        hashSet.add("welcome");
        hashSet.add(16.4);
        hashSet.add('A');
        hashSet.add(true);
        hashSet.add(null);

        // It does not maintain any order of element
        // Insertion order not preserverd
        System.out.println(hashSet);

        hashSet.remove(16.4);
        System.out.println("\nAfter removing element:"+hashSet);

        System.out.println("\nHashset contains 'welcome'?:"+hashSet.contains("welcome"));
        System.out.println("Hashset contains 'xyz'?:"+hashSet.contains("xyz"));

        HashSet hashSetCopy = new HashSet();
        hashSetCopy.add(100);
        hashSetCopy.add(16.4);
        hashSetCopy.add('A');
        hashSetCopy.add(true);
        hashSetCopy.add(null);

        hashSet.removeAll(hashSetCopy);
        System.out.println("\nHashset removeAll method:"+hashSet);
    }
}
