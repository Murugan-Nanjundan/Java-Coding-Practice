package NumberPrograms;

public class StrongNumber {
//Example: 145 = 1! + 4! + 5!
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }

    public static void main(String[] args) {

        int number = 145;
        int original = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        if (sum == original)
            System.out.println("Strong Number");
        else
            System.out.println("Not Strong Number");
    }
}