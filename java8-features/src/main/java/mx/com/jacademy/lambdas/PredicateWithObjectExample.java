package mx.com.jacademy.lambdas;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {

    String name;
    int salary;
    int experience;

    Employee(String name, int salary, int experience) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }
}

public class PredicateWithObjectExample {

    public static void main(String[] args) {

        // Example 1
        Employee employee = new Employee("John", 20000, 5);

        Predicate<Employee> employeePredicate = e -> (e.salary>30000 && e.experience>3);

        System.out.println(employeePredicate.test(employee)+"\n");

        // Example 2
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 50000, 5));
        employees.add(new Employee("David", 20000, 2));
        employees.add(new Employee("Scott", 30000, 3));
        employees.add(new Employee("Mary", 40000, 6));

        for(Employee e : employees) {
            if(employeePredicate.test(e)) {
                System.out.println(e.name);
            }
        }
    }
}
