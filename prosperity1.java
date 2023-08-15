import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class prosperity1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> A = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            A.add(sc.nextInt());
        }

        List<int[]> finalList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j >= i) {
                    finalList.add(new int[]{i, j});
                }
            }
        }

        int maximum = 0;
        for (int i = 0; i < finalList.size(); i++) {
            for (int j = 0; j < finalList.size(); j++) {
                if (i != j) {
                    int[] subarrayA = finalList.get(i);
                    int[] subarrayB = finalList.get(j); 

                    int[] a = new int[subarrayA[1] - subarrayA[0] + 1];
                    int[] b = new int[subarrayB[1] - subarrayB[0] + 1];

                    for (int p = subarrayA[0] - 1, q = 0; p < subarrayA[1]; p++, q++) {
                        a[q] = A.get(p);
                    }

                    for (int p = subarrayB[0] - 1, q = 0; p < subarrayB[1]; p++, q++) {
                        b[q] = A.get(p);
                    }

                    boolean noOverlap = true;
                    for (int x : a) {
                        for (int y : b) {
                            if (x == y) {
                                noOverlap = false;
                                break;
                            }
                        }
                        if (!noOverlap) {
                            break;
                        }
                    }

                    if (noOverlap && subarrayA[1] < subarrayB[0]) {
                        int ans = subarrayB[0] - subarrayA[1];
                        if (ans > k) {
                            int sumValue = 0;
                            for (int p = subarrayA[0] - 1; p < subarrayA[1]; p++) {
                                sumValue += A.get(p);
                            }

                            for (int p = subarrayB[0] - 1; p < subarrayB[1]; p++) {
                                sumValue += A.get(p);
                            }

                            maximum = Math.max(maximum, sumValue);
                        }
                    }
                }
            }
        }

        System.out.println(maximum);
    }
}
