package mx.com.jacademy.collections.list;

import java.util.ArrayList;

public class ArrayListExample {

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
        System.out.println("Number of elements in array list:"+arrayList.size());

        // Remove 'welcome' element
        arrayList.remove(1);
        //arrayList.remove("welcome")
        //[100, 15.5, A, true]
        System.out.println("After removing 'welcome' element from array list:"+arrayList);

        // Insert new element
        //[100, 15.5, Python, A, true]
        arrayList.add(2, "Python");
        System.out.println("After insertion on second position:"+arrayList);
    }
}
