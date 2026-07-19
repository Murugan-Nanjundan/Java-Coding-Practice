package CollectionFramework;

import java.util.*;

public class SortMapByKey {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();

        map.put(3,"C");
        map.put(1,"A");
        map.put(2,"B");

        Map<Integer,String> treeMap = new TreeMap<>(map);

        System.out.println(treeMap);
    }
}