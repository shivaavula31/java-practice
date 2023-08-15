import java.util.*;
// Maximum size square sub-matrix with all 1s

public class MaximalSquare {
    public static void printMaximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        int maxLen = 0;
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = matrix[i][j] - '0';
                } else if (matrix[i][j] == '1') {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i][j - 1], dp[i - 1][j])) + 1;
                }

                if (dp[i][j] > maxLen) {
                    maxLen = dp[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        if (maxLen == 0) {
            System.out.println("No square submatrix with all ones found.");
            return;
        }

        System.out.println("Maximal Square:");
        for (int i = maxRow; i > maxRow - maxLen; i--) {
            for (int j = maxCol; j > maxCol - maxLen; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        char[][] matrix = new char[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.next().charAt(0);
            }
        }

        printMaximalSquare(matrix);
    }
}
