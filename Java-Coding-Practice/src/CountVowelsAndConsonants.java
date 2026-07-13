public class CountVowelsAndConsonants {
    public static void main(String[] args) {
//make it to lower case and check in index of aeiou
        String str = "Hello Murugan".toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) {
                    vowels++;
                }else {
                    consonants++;
                }

            }
        }
        System.out.println("Vowles: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
