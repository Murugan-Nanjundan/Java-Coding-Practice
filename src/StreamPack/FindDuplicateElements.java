package StreamPack;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicateElements {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(1,2,3,4,2,5,1,6,7,3);

        Set<Integer> set = new HashSet<>();

        Set<Integer> duplicates = numbers.stream()
                .filter(n -> !set.add(n))
                .collect(Collectors.toSet());

        System.out.println("Duplicate Elements : " + duplicates);
    }
}