
public class FibonacciSeries {
    public static void main(String[] args) {

        // Each number is the sum of the previous two numbers

        int count = 10; // random number to find the Fibonacci series

        int a = 0;
        int b = 1; // initial numbers

        for (int i = 0; i < count; i++) {
            System.out.println(a + "");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}