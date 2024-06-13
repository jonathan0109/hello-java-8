package mx.com.jacademy.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapExample {
    
    public static void main(String[] args) {
        
        HashMap hashMap = new HashMap();
        hashMap.put(101, "John");
        hashMap.put(102, "David");
        hashMap.put(103, "Scott");
        hashMap.put(104, "Mary");
        hashMap.put(105, "Tye");

        System.out.println(hashMap);
        
        // Overwriting values
        hashMap.put(103, "X");
        hashMap.put(106, "David");
        System.out.println("\nOverwriting value for the 103 key: "+hashMap);

        // Getting specific value
        System.out.println("\nGetting value for 105 key: "+hashMap.get(105));

        // Remove specific value
        hashMap.remove(106);
        System.out.println("\nRemoving value for 106 key: "+hashMap);

        // Searching by key
        System.out.println("\nIs there 101 key?:"+hashMap.containsKey(101));
        System.out.println("Is there 106 key?:"+hashMap.containsKey(106));

        // Searching by value
        System.out.println("\nIs there Mary?:"+hashMap.containsValue("Mary"));
        System.out.println("Is there YG?:"+hashMap.containsValue("YG"));

        // Empty method
        System.out.println("\nIs map empty?:"+hashMap.isEmpty());

        // Get all keys
        System.out.println("\nKeys on map:"+hashMap.keySet());

        // Get all values
        System.out.println("Values on map:"+hashMap.values());

        // Getting content by entrySet
        System.out.println("\nContent by entrySet:"+hashMap.entrySet());

        System.out.println("\nIterating the keys:");
        for(Object i:hashMap.keySet()){
            System.out.println(i);
        }

        System.out.println("\nIterating the values:");
        for(Object i:hashMap.values()){
            System.out.println(i);
        }

        HashMap<Integer,String> typedHashMap = new HashMap<Integer,String> ();
        typedHashMap.put(101, "John");
        typedHashMap.put(102, "David");
        typedHashMap.put(103, "Scott");
        typedHashMap.put(104, "Mary");
        typedHashMap.put(105, "Tye");

        System.out.println("\nIterating map with 'for' and 'entrySet':");
        for(Map.Entry entry:typedHashMap.entrySet()){

            System.out.println(entry.getKey() + "   " + entry.getValue());
        }

        System.out.println("\nIterating map with 'iterator':");
        Set set = typedHashMap.entrySet();
        Iterator iterator=set.iterator();

        while (iterator.hasNext()) {
            Map.Entry entry = (Entry) iterator.next();
            System.out.println(entry.getKey() + "   " + entry.getValue());
        }
    }
}
