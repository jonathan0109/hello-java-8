package mx.com.jacademy.lambdas;

import java.util.function.Predicate;

/**
 * Represents a predicate (boolean-valued function) of one argument.
 * This is a functional interface whose functional method is tested.
 */
public class PredicateExample {

    public static void main(String[] args) {

        // Example 1
        Predicate<Integer> p = i -> i > 10;

        System.out.println(p.test(20));
        System.out.println(p.test(5));

        // Example 2 : Check the length of give string is greater than 4 or not.
        // Multiple conditions in one predicate
        Predicate<String> pLength = s -> s.length() > 4 && s.startsWith("S") && s.endsWith("t");

        System.out.println("\n"+pLength.test("welcome"));
        System.out.println(pLength.test("abc")+"\n");

        // Example 3 : Print array elements whose size is > 4 from array
        String names[] = {"David", "Scott", "Smith", "John", "Mary"};

        for (String name : names) {

            if(pLength.test(name)) {
                System.out.println(name);
            }
        }

        // Example 4
        int a[] = {5,15,20,25,30,25,40,45,50,55,60,65};

        Predicate<Integer> residue = i -> i%2==0;
        Predicate<Integer> greaterThan = i -> i>50;

        System.out.println("\nNumbers on the array without residue:");

        // 20, 30, 40, 50, 60
        for(int num : a) {
            if(residue.test(num)) {
                System.out.println(num);
            }
        }

        System.out.println("\nNumbers on the array greater than 50:");

        //55, 60, 65
        for(int num : a) {
            if(greaterThan.test(num)) {
                System.out.println(num);
            }
        }
    }
}
