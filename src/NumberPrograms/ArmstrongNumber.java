package NumberPrograms;

public class ArmstrongNumber {

    public static void main(String[] args) {
//Example: 153 = 1³ + 5³ + 3³ = 153
        int number = 153;
        int original = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }

        if (sum == original)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}