package mx.com.jacademy.collections.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample{

    public static void main(String[] args){
        
        // ArrayList for any object
        ArrayList arrayList = new ArrayList();
        
        // Adding elements
        arrayList.add(100);
        arrayList.add("welcome");
        arrayList.add(15.5);
        arrayList.add('A');
        arrayList.add(true);

        System.out.println(arrayList); //[100, welcome, 15.5, A, true]

        // Size
        System.out.println("\nNumber of elements in array list:"+arrayList.size());

        // Remove 'welcome' element by index
        arrayList.remove(1);
        // Remove 'welcome' element by word match
        // arrayList.remove("welcome")
        // [100, 15.5, A, true]
        System.out.println("\nAfter removing 'welcome' element from array list:"+arrayList);

        // Insert new element
        // [100, 15.5, Python, A, true]
        arrayList.add(2, "Python");
        System.out.println("\nAfter insertion on second position:"+arrayList);

        // Retrieve specific element
        // Python
        System.out.println("\nGetting second position from list:"+arrayList.get(2));

        // Change/replace element
        // [100, 15.5, C#, A, true]
        arrayList.set(2, "C#");
        System.out.println("\nAfter replacing element:"+arrayList);

        // Using 'contains' for searching on list - Returns true/false
        System.out.println("\nIs C# on list?:"+arrayList.contains("C#"));
        System.out.println("Is C++ on list?:"+arrayList.contains("C++"));

        // Is empty
        System.out.println("\nIs list empty?:"+arrayList.isEmpty());

        // For loop
        System.out.println("\nReading elements using for loop");
        for(int i=0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        // For each loop
        System.out.println("\nReading elements using for each loop");
        for(Object object:arrayList){
            System.out.println(object);
        }

        // Iterator
        // You might need to use iterators if you need to modify collection in your loop
        System.out.println("\nReading elements using iterator method");
        Iterator iterator = arrayList.iterator();
        
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
