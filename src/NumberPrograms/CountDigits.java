package NumberPrograms;

public class CountDigits {

    public static void main(String[] args) {

        int number = 987654;
        int count = 0;

        while (number > 0) {

            count++;
            number /= 10;
        }

        System.out.println("Digits = " + count);
    }
}