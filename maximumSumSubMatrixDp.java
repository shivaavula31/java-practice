import java.util.*;

class maximumSumSubMatrix {
    static void findMaximumSumSubmatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Variables to store the maximum sum and the indices of the submatrix
        int maxSum = Integer.MIN_VALUE;
        int startRow = 0;
        int endRow = 0;
        int startCol = 0;
        int endCol = 0;

        int[] tempRowSums = new int[rows];

        for (int leftCol = 0; leftCol < cols; leftCol++) {
            Arrays.fill(tempRowSums, 0);

            for (int rightCol = leftCol; rightCol < cols; rightCol++) {
                // Calculate the row-wise sums between leftCol and rightCol
                for (int row = 0; row < rows; row++) {
                    tempRowSums[row] += matrix[row][rightCol];
                }

                // Apply Kadane's algorithm to find the maximum sum subarray in the tempRowSums
                int currentSum = tempRowSums[0];
                int maxSumSoFar = tempRowSums[0];
                int currentStartRow = 0;
                int currentEndRow = 0;

                for (int i = 1; i < rows; i++) {
                    if (tempRowSums[i] > tempRowSums[i] + currentSum) {
                        currentSum = tempRowSums[i];
                        currentStartRow = i;
                    } else {
                        currentSum += tempRowSums[i];
                    }

                    if (currentSum > maxSumSoFar) {
                        maxSumSoFar = currentSum;
                        currentEndRow = i;
                    }
                }

                // Update the maximum sum and submatrix indices if a new maximum is found
                if (maxSumSoFar > maxSum) {
                    maxSum = maxSumSoFar;
                    startRow = currentStartRow;
                    endRow = currentEndRow;
                    startCol = leftCol;
                    endCol = rightCol;
                }
            }
        }

        // Print the maximum sum submatrix
        System.out.println("Maximum sum submatrix:");
        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        findMaximumSumSubmatrix(matrix);
    }
}
