import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CamelCasePatternMatchs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after the integer input

        while (T-- > 0) {
            int n = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character after the integer input

            List<String> dictionary = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                dictionary.add(scanner.next());
            }

            String pattern = scanner.next();
            printMatchingWords(dictionary, pattern);
        }
    }

    private static void printMatchingWords(List<String> dictionary, String pattern) {
        boolean matchFound = false;

        for (String word : dictionary) {
            if (isCamelCasePatternMatch(word, pattern)) {
                System.out.println(word);
                matchFound = true;
            }
        }

        if (!matchFound) {
            System.out.println("No match found");
        }
    }

    private static boolean isCamelCasePatternMatch(String word, String pattern) {
        if (word.length() != pattern.length()) {
            return false;
        }

        for (int i = 0; i < word.length(); i++) {
            char wordChar = word.charAt(i);
            char patternChar = pattern.charAt(i);

            if (Character.isLowerCase(wordChar) || Character.isLowerCase(patternChar)) {
                return false;
            }

            if (wordChar != patternChar) {
                return false;
            }
        }

        return true;
    }
}