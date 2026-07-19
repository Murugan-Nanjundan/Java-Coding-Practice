package StreamPack;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestSalary {


    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(101, "John", 50000),
                new Employee(102, "David", 70000),
                new Employee(103, "Alex", 60000),
                new Employee(104, "Smith", 90000),
                new Employee(105, "James", 80000));

        Double secondHighest = employees.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println("Second Highest Salary : " + secondHighest);
    }

}
