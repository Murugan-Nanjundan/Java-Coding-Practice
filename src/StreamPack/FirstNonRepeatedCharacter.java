package StreamPack;

import java.util.*;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "swiss";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : str.toCharArray()) {
            if (map.get(c) == 1) {
                System.out.println("First non-repeated character: " + c);
                break;
            }
        }
    }
}