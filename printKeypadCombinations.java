import java.util.*;

public class printKeypadCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printKeypadCombinations(n, "");
    }

    public static void printKeypadCombinations(int n, String output) {
        if (n == 0) {
            System.out.println(output);
            return;
        }

        String[] keypad = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        int digit = n % 10;
        String characters = keypad[digit];
        
        for (int i = 0; i < characters.length(); i++) {
            printKeypadCombinations(n / 10, characters.charAt(i) + output);
        }

    }
}