package StringPack;

public class RemoveWhiteSpaces {

    public static void main(String[] args) {

        String str = "Java Interview Questions";

        String result = str.replaceAll("\\s+", "");

        System.out.println(result);
    }
}