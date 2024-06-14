package mx.com.jacademy.lambdas;

/**
 * A functional interface is an interface that contains only one abstract method.
 *  They can have only one functionality to exhibit.
 */
@FunctionalInterface
interface Cab {

    String bookCab(String source, String destination);
}

public class FunctionalInterfaceExample {
    
    public static void main(String[] args) {

        /**
         * Lambda expressions can be used to represent the instance of a functional interface.
         */
        Cab cab = (source, destination) -> {
            System.out.println("Ola cab is booked from " + source + " to " + destination);
            return ("Price : 5000 Rs");
        };

        System.out.println(cab.bookCab("Mexico", "USA"));
    }
}
