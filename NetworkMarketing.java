import java.util.*;

class NetworkMarketing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int amount = sc.nextInt();
        int per = sc.nextInt();
        int i = 0;
        while (i < n) {
            int result = (per * amount) / 100;
            amount  = result;
            i++;
        }
        System.out.print(amount);
    }
}
