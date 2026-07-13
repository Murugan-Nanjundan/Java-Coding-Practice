import java.util.Arrays;
import java.util.List;

public class FindHighestNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 50, 20, 40, 10, 70);
        int max = numbers.stream().max(Integer::compareTo)
                .orElse(0);
        System.out.println("Max Number is " + max);

        int min = numbers.stream().min(Integer::compareTo).orElse(0);
        System.out.println("Min Number is " + min);
    }
}
