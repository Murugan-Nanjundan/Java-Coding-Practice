import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class NumberOfCharCountOccurrences {
    public static void main(String[] args)
    {
        String str= "banana";

        Map<String,Long> result = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(s->s,Collectors.counting()));
        System.out.println(result);
    }
}
