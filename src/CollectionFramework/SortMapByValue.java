package CollectionFramework;

import java.util.*;

public class SortMapByValue {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();

        map.put(1,"Orange");
        map.put(2,"Apple");
        map.put(3,"Banana");

        List<Map.Entry<Integer,String>> list =
                new ArrayList<>(map.entrySet());

        list.sort(Map.Entry.comparingByValue());

        for(Map.Entry<Integer,String> entry : list){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}