import java.util.*;

class combinationsum {
    public static void combinations(int arr[], int n, int target, ArrayList<Integer> list, int i) {
        if (target == 0) {
            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(j)+" ");
            }
            System.out.print("\n");
            return;
        }

        if (i >= n || target < 0)
            return;

        list.add(arr[i]);
        combinations(arr, n, target - arr[i], list, i + 1);
        list.remove(list.size() - 1);
        combinations(arr, n, target, list, i + 1);
    }

    public static void printcombinations(int arr[], int n, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        combinations(arr, n, target, list, 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        printcombinations(arr, n, target);
    }
}
