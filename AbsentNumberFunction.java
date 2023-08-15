import java.util.Scanner;

public class AbsentNumberFunction {
    public static long calculateAbsentNumber(int[] sequence) {
        int n = sequence.length;
        long sum = 0;

        // Iterate through all possible subsequences
        for (int i = 0; i < (1 << n); i++) { 
            long absentNumber = 1; // Initialize absent number as 1
            boolean[] present = new boolean[n + 1];

            // Iterate through the sequence elements
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) { // Check if j-th element is present in the subsequence
                    present[sequence[j]] = true;
                }
            }

            // Find the smallest absent number in the subsequence
            while (present[(int) absentNumber]) {
                absentNumber++;
            }

            sum += absentNumber;
            sum %= 1000000007; // Take the result modulo 10^9 + 7
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input
        int n = scanner.nextInt();
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }

        // Calculate the sum of absent numbers
        long result = calculateAbsentNumber(sequence);

        // Print the result
        System.out.println(result);
    }
}
