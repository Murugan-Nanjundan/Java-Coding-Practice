package CollectionFramework;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesUsingStream {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,2,4,1,5);

        List<Integer> result = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}