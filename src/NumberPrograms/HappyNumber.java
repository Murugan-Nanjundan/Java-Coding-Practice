package NumberPrograms;

import java.util.HashSet;

public class HappyNumber {

    static int squareSum(int n) {

        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        int number = 19;

        HashSet<Integer> set = new HashSet<>();

        while (number != 1 && !set.contains(number)) {
            set.add(number);
            number = squareSum(number);
        }

        if (number == 1)
            System.out.println("Happy Number");
        else
            System.out.println("Not Happy Number");
    }
}