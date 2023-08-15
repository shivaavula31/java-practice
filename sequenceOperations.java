import java.util.HashSet;
import java.util.Scanner;

class SequenceOperations {
    private static int factorial(int n) {
        if (n == 0)
            return 1;
        int factorial = 1;
        for (int i = 2; i <= n; i++)
            factorial *= i;
        return factorial;
    }

    private static int countUnique(int[] a) {
        HashSet<Integer> set = new HashSet<>();
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            if (!set.contains(a[i])) {
                set.add(a[i]);
                res++;
            }
        }
        return res;
    }

    private static int totalCombination(int n, int x) {
        return factorial(n) / (factorial(x) * factorial(n - x));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int k = countUnique(a);
        int ans;
        if (x % 2 == 0) {
            ans = 1;
            ans += totalCombination(k, x);
        } else {
            ans = k - 1;
            ans += totalCombination(k, x);
        }
        System.out.println(ans);
    }
}
