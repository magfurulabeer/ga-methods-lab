import com.sun.deploy.util.ArrayUtil;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    private static float maxOfTwoNumbers(float a, float b) {
        return a > b ? a : b;
    }

    private static float maxOfThree(float a, float b, float c) {
        return maxOfTwoNumbers(maxOfTwoNumbers(a, b), c);
    }

    private static boolean isCharacterAVowel(char ch) {
        String vowels = "aeiou";
        String character = Character.toString(ch).toLowerCase();
        return vowels.contains(character);
    }

    public static int numArgs(String... args) {
        return args.length;
    }

    public static String reverseString(String text) {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0 ; i--) {
            reversed += text.charAt(i);
        }
        return reversed;
    }

    public static String findLongestWord(String[] words) {
        String longest = "";
        for (int i = 0; i < words.length ; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }
        return longest;
    }
}
