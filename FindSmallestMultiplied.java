import java.util.*;

class FindSmallestMultiplied {
    public static int isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return 0;
        }
        return 1;
    }

    public static void primeFactors(int n, ArrayList<Integer> list) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i) == 1) {
                int x = n;
                while (x % i == 0) {
                    list.add(i);
                    x /= i;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        primeFactors(n, list);
        double k = Math.log10(n) + 1;
        int noOfDigits = (int) k;

        // Calculate the smallest number by multiplying the prime factors
        int result = 1;
        for (int factor : list) {
            result *= factor;
        }

        // Append extra 1s to the result if necessary
        while (noOfDigits > list.size()) {
            result *= 1;
            noOfDigits--;
        }

        System.out.println(result);
    }
}
