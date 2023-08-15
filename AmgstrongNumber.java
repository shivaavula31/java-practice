import java.util.*;

public class AmgstrongNumber {
    public static void main(String[] args) {
        int x, n, y;
        int arr[] = new int[10];
        int i = 0, sum = 0;

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        x = number;
        while (x != 0) {
            arr[i] = x % 10;
            x = x / 10;
            i++;
        }

        int length = i;
        for (int j = 0; j < length; j++) {
            int p = (int) Math.pow(arr[j], length);
            sum = sum + p;
        }

        if (sum == number)
            System.out.print("armstrong number");
        else
            System.out.print("not an armstrong number");
    }
}
