import java.util.Scanner;

public class MissingPalindromePart {
    public static boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static String findMissingPalindromePart(String s) {
        String missingPart = "";
        for (int i = 0; i < s.length(); i++) {
            if (isPalindrome(s.substring(i))) {
                missingPart = new StringBuilder(s.substring(0, i)).reverse().toString();
                break;
            }
        }
        return missingPart;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        String missingPart = findMissingPalindromePart(inputString);

        if (!missingPart.isEmpty()) {
            System.out.println("Missing palindrome part: " + missingPart);
        } else {
            System.out.println("The string is already a palindrome.");
        }
    }
}
