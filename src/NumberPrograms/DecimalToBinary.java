package NumberPrograms;

public class DecimalToBinary {

    public static void main(String[] args) {

        int number = 25;

        String binary = "";

        while (number > 0) {
            binary = (number % 2) + binary;
            number /= 2;
        }

        System.out.println(binary);
    }
}