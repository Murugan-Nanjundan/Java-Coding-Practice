import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {

        String str="programming";
        Set<Character> set = new HashSet<>();
        StringBuilder sb= new StringBuilder();
        for(char c: str.toCharArray())
        {
             set.add(c);
        }
        for(char c : set)
        {
            sb.append(c);
        }
        System.out.println(sb);
    }
}
