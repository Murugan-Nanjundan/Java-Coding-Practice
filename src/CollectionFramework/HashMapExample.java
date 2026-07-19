package CollectionFramework;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();

        map.put(101,"Java");
        map.put(102,"Spring");
        map.put(103,"Hibernate");

        System.out.println(map);

        System.out.println(map.get(102));

        map.remove(103);

        System.out.println(map);
    }
}