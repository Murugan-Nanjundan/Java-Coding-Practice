public class PrimeNumber {
    public static void main(String[] args) {

        //Check divisibility from 2 to n/2
        // if divisible, not prime
        // Why i * i <= number?
        //  If a number has a factor greater than its square root,
        //  it must also have a corresponding factor smaller than the square root. So checking beyond √n is unnecessary.
        boolean prime=true;

        int number = 50;

        if (number <= 1) {
            prime = false;
        }
        else{
            for (int i = 2; i * i <= number / 2; i++) {
                if (number % i == 0) {
                    prime=false;
                    break;
                }
            }
        }

        System.out.println(prime ? "prime Number": "not Prime");

    }
}