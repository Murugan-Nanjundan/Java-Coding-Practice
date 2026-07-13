import java.util.*;

public class FindDuplicatesUsingStreams {
    public static void main(String[] args) {

        //using HashSet to find the duplicate

      List<Integer> nums = Arrays.asList(5,3,6,3,7,2,8,9,20,45,78,43,23,100);
        //List.of(numbers);

        Set<Integer> seen = new HashSet<>();

        nums.stream().filter(n->!seen.add(n))
                .forEach(System.out::println);
    }
}
