import java.util.HashSet;
import java.util.Set;

public class FindCommonElementsBetweenTwoArrays {
    public static void main(String[] args) {

        int[] array1={2,4,5,6,7,1,4};
        int[]  array2 ={6,4,2,4,1,5,3,8};

        Set<Integer> numbers= new HashSet<>();

        for(int i:array1)
        {
            for(int j: array2)
            {
                if(i==j)
                {
                    System.out.println(i);
                    numbers.add(i);
                }
            }
        }
        System.out.println(numbers);
    }
}
