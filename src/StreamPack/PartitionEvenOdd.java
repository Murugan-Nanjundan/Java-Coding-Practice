package StreamPack;

import java.util.*;

public class PartitionEvenOdd {
    public static void main(String[] args) {

        int[] numbers = {10, 21, 32, 43, 54, 65};

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int num : numbers) {
            if (num % 2 == 0)
                even.add(num);
            else
                odd.add(num);
        }

        System.out.println("Even Numbers: " + even);
        System.out.println("Odd Numbers: " + odd);
    }
}