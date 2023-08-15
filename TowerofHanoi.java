import java.util.Scanner;
 class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numDisks =sc.nextInt();
        solveTowerOfHanoi(numDisks, "A", "C", "B");
    }

    public static void solveTowerOfHanoi(int n, String source, String destination, String auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        solveTowerOfHanoi(n - 1, source, auxiliary, destination);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        solveTowerOfHanoi(n - 1, auxiliary, destination, source);
    }
}
