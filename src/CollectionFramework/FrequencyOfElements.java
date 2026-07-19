package CollectionFramework;

import java.util.*;

public class FrequencyOfElements {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("A","B","A","C","B","A");

        Map<String,Integer> map = new HashMap<>();

        for(String str : list){
            map.put(str, map.getOrDefault(str,0)+1);
        }

        System.out.println(map);
    }
}