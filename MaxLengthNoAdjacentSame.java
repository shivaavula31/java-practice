import java.util.Scanner;

public class MaxLengthNoAdjacentSame {
    public static int maxLengthNoAdjacentSame(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int maxLength = 1;
        int currentLength = 1;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 1;
            }
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sequence of 0s and 1s: ");
        String inputSequence = scanner.nextLine();
        scanner.close();
        
        int[] inputArray = new int[inputSequence.length()];
        for (int i = 0; i < inputSequence.length(); i++) {
            inputArray[i] = Character.getNumericValue(inputSequence.charAt(i));
        }
        
        int result = maxLengthNoAdjacentSame(inputArray);
        System.out.println("Maximum length with no adjacent same digits: " + result);
    }
}
