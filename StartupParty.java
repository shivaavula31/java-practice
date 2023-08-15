import java.util.Scanner;

public class StartupParty {

    public static int findOptimalInefficiency(int N, int K, int[] a) {
        int[][] dp = new int[N + 1][N + 1];
        int[][] arguments = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            dp[i][i] = K;
        }

        for (int i = 1; i < N; i++) {
            if (a[i] == a[i + 1]) {
                arguments[i][i + 1] = 2;
            }
        }

        for (int length = 3; length <= N; length++) {
            for (int i = 1; i <= N - length + 1; i++) {
                int j = i + length - 1;

                if (a[i] == a[j]) {
                    arguments[i][j] = arguments[i + 1][j - 1];
                }

                int minInefficiency = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int inefficiency = dp[i][k] + dp[k + 1][j];
                    minInefficiency = Math.min(minInefficiency, inefficiency);
                }

                dp[i][j] = minInefficiency + arguments[i][j];
            }
        }

        return dp[1][N];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Invalid number of employees. Exiting the program.");
            return;
        }

        System.out.print("Enter the table cost: ");
        int K = scanner.nextInt();

        if (K <= 0) {
            System.out.println("Invalid table cost. Exiting the program.");
            return;
        }

        int[] a = new int[N + 1];
        System.out.println("Enter the salaries of the employees:");
        for (int i = 1; i <= N; i++) {
            a[i] = scanner.nextInt();
        }

        int optimalInefficiency = findOptimalInefficiency(N, K, a);
        System.out.println("Optimal Inefficiency: " + optimalInefficiency);
    }
}
