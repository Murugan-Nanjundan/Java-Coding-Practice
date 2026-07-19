package StreamPack;

public class LongestString {
    public static void main(String[] args) {

        String[] words = {"Java", "Programming", "Python", "Development"};

        String longest = words[0];

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest String: " + longest);
    }
}