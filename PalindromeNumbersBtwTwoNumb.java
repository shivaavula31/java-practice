public class PalindromeNumbersBtwTwoNumb {
    public static void main(String[] args) {
        int lowerLimit = 10;
        int upperLimit = 80;

        System.out.println("Palindrome numbers between " + lowerLimit + " and " + upperLimit + ":");
        printIntermediatePalindromes(lowerLimit, upperLimit);
    }

    public static void printIntermediatePalindromes(int lowerLimit, int upperLimit) {
        for (int num = lowerLimit; num <= upperLimit; num++) {
            if (isPalindrome(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }
}
