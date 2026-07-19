package StringPack;

public class StringToInteger {

    public static void main(String[] args) {

        String str = "12345";

        int number = 0;

        for (char ch : str.toCharArray()) {
            number = number * 10 + (ch - '0');
        }

        System.out.println(number);
    }
}