import java.util.Arrays;
import java.util.Scanner;

public class CollectingCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int[] candies = new int[N];

            for (int i = 0; i < N; i++) {
                candies[i] = sc.nextInt();
            }
            Arrays.sort(candies);
            int total_time = 0;
            for (int i = 1; i < N; i++) {
                total_time += candies[i] + candies[i - 1]; 
                candies[i] += candies[i - 1];
            }

            System.out.println(total_time);
        }
    }
}
