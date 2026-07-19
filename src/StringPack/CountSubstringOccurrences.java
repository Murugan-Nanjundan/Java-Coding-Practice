package StringPack;

public class CountSubstringOccurrences {

    public static void main(String[] args) {

        String str = "JavaJavaJava";
        String sub = "Java";

        int count = 0;
        int index = 0;

        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }

        System.out.println("Occurrences = " + count);
    }
}