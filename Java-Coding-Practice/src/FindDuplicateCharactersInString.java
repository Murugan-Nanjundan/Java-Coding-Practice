import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharactersInString {
    public static void main(String[] args) {

        // Used HashMap to count occurrences

        String str="programming";

       Map<Character,Integer> map= new HashMap<>();
       for(Character c: str.toCharArray())
       {
           map.put(c, map.getOrDefault(c,0)+1);
       }
       map.entrySet()
               .stream()
               .filter(e->e.getValue()>1)
               .forEach(System.out::println);
    }
}