import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {

        // two words are anagrams id they contain the same characters.

        String str1="silent";
        String str2="listen";

        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        System.out.println(" The given word is Anagram: "+ Arrays.equals(s1, s2));
    }
}
