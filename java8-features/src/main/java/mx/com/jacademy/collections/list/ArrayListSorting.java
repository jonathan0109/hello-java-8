package mx.com.jacademy.collections.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
 
    /***
     * Sorting is a fundamental operation in computer science, essential for data organization 
     * and manipulation across various applications.
    ***/

    public static void main(String[] args){
        
        ArrayList arrayList = new ArrayList();

        arrayList.add("X");
        arrayList.add("Y");
        arrayList.add("Z");
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");

        System.out.println("Elements in the array list:"+arrayList);
        //[X, Y, Z, A, B, C]

        // Sorts the specified list into ascending order, according to the natural ordering of its elements
        // [A, B, C, X, Y, Z]
        Collections.sort(arrayList);
        System.out.println("\nElements in the array list after sorting:"+arrayList);
        
        // Imposes the reverse of the natural ordering on a collection of objects
        // [Z, Y, X, C, B, A]
        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println("\nElements in the array list after sorting in reverse order:"+arrayList);

        // Randomly permutes the specified list using a default source of randomness
        Collections.shuffle(arrayList);
        System.out.println("\nElements in the array list after shuffling:"+arrayList);
    }
}
