package CollectionFramework;

import java.util.*;

public class ListToSet {

    public static void main(String[] args) {

        List<String> list =
                Arrays.asList("Java","Spring","Java","SQL");

        Set<String> set = new HashSet<>(list);

        System.out.println(set);
    }
}