import java.util.*;
public class MinimumProductNumber {
    public static int findMinimumNumber(int target) {
        if (target == 0) {
            return 10;  // Special case: product of digits is 0, so return 10
        }

        // Find the minimum number by continuously dividing the target by its factors
        int result = 0;
        int multiplier = 1;

        for (int i = 9; i >= 2; i--) {
            while (target % i == 0) {
                result += i * multiplier;
                multiplier *= 10;
                target /= i;
            }
        }

        // If the target is not reduced to 1, it means there is no solution
        if (target != 1) {
            return -1;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input =sc.nextInt();
        int minimumNumber = findMinimumNumber(input);
        System.out.println(minimumNumber);
    }
}
