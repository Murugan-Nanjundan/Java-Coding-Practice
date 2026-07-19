package CollectionFramework;

import java.util.*;

public class RemoveDuplicatesFromList {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,2,4,1,5);

        Set<Integer> set = new HashSet<>(list);

        System.out.println(set);
    }
}