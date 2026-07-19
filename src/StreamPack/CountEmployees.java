/*
package StreamPack;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEmployees {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(101,"John","IT"),
                new Employee(102,"David","HR"),
                new Employee(103,"Alex","IT"),
                new Employee(104,"Smith","Finance"),
                new Employee(105,"James","HR"),
                new Employee(106,"Kevin","IT"));

        Map<String,Long> count =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.counting()));

        count.forEach((dept,total)->
                System.out.println(dept + " : " + total));
    }
}
}
*/
