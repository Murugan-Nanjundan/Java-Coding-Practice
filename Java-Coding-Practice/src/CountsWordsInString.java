public class CountsWordsInString {
    public static void main(String[] args) {

        String str= " Java is awesome";

        String[] words= str.trim().split("\\s+");
        System.out.println(words.length);
    }
}
