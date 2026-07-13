public class Factorial {
    public static void main(String[] args) {
        // Multiply all numbers from 1 to n
        int number=5;
        int factorial=1;

        for(int i=1;i<=number; i++)
        {
            factorial *=i;
        }
        System.out.println(factorial);
    }
}