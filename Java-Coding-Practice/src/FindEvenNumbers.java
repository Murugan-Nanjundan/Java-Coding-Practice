import java.util.Arrays;
import java.util.List;

public class FindEvenNumbers {
    public static void main(String[] args) {
        List<Integer>  numbers = Arrays.asList(3,6,7,10,5,3,2,50,43,29);
        numbers.stream().filter(n->n%2==0).forEach(System.out::println);
    }
}
