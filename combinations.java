import java.util.*;

class combinations {
    public static void combinations(int arr[], int n, int r, int index, int data[], int i) {
        if (index == r) {
            for (int j = 0; j < r; j++)
                System.out.print(data[j]);
            System.out.print("\n");
            return;
        }
        if (i >= n)
            return;

        data[index] = arr[i];
        combinations(arr, n, r, index + 1, data, i + 1);
        while (i < n - 1 && arr[i] == arr[i + 1])
            i++;
        combinations(arr, n, r, index, data, i + 1);
    }

    public static void printcombinations(int arr[], int n, int r) {
        int data[] = new int[r];
        combinations(arr, n, r, 0, data, 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int r = sc.nextInt();
        printcombinations(arr, arr.length, r);
    }
}
