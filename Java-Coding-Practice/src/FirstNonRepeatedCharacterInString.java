import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class FirstNonRepeatedCharacterInString {
    public static void main(String[] args) {

        String str="Netherlands";
        Map<Character,Integer> map = new LinkedHashMap<>();

        for(Character c:str.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        Optional<Map.Entry<Character, Integer>> result = map.entrySet().stream()
                .filter(e->e.getValue()==1)
                .findFirst();

        if(result.isPresent())
        {
            System.out.println(result);
        }
    }
}
