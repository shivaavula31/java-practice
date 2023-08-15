import java.util.Scanner;

class countCommonSubSeq {
    static int countSequences(String str, String str2) {
        int n1 = str.length();
        int n2 = str2.length();
        int[][] cnt = new int[n1 + 1][n2 + 1];

        for (int i = 0; i <= n1; i++) {
            for (int j = 0; j <= n2; j++) {
                cnt[i][j] = 0;
            }
        }

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (str.charAt(i - 1) == str2.charAt(j - 1)) {
                    cnt[i][j] = 1 + cnt[i][j - 1] + cnt[i - 1][j];
                } else {
                    cnt[i][j] = cnt[i][j - 1] + cnt[i - 1][j] - cnt[i - 1][j - 1];
                }
            }
        }

        return cnt[n1][n2];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        System.out.println("Number of common subsequences is: " + countSequences(str, str2));
    }
}
