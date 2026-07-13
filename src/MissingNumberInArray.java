public class MissingNumberInArray {
    public static void main(String[] args) {

        int[] numbers = {0, 1, 2, 3, 5};
        //n(n+1)/2

        int n = 5;

        int expected = n * (n + 1) / 2;
        System.out.println(expected);

        int actual = 0;

        for (int num : numbers) {
            actual += num;
        }

        System.out.println(expected - actual);

    }
}
