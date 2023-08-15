import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostOccurringCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        char mostOccurringChar = findMostOccurringCharacter(inputString);
        System.out.println("The most occurring character is: " + mostOccurringChar);
    }

    public static char findMostOccurringCharacter(String string) {
        Map<Character, Integer> charCount = new HashMap<>();

        // Count the occurrences of each character
        for (char c : string.toCharArray()) {
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        // Find the character with the maximum count
        int maxCount = 0;
        char mostOccurringChar = '\0';

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount) {
                maxCount = count;
                mostOccurringChar = c;
            }
        }

        return mostOccurringChar;
    }
}
