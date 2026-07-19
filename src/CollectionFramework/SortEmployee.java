package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEmployee {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(101,"John",50000));
        list.add(new Employee(102,"David",70000));
        list.add(new Employee(103,"Alex",60000));

        Collections.sort(list,
                Comparator.comparingDouble(e->e.salary));

        list.forEach(System.out::println);
    }
}