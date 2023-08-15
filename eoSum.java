import java.util.*;

class eoSum {

    public static int kCr(int k,int i){
            int comb=1;
            for(int j=1;j<k;j++){
                 comb*=(k-j+1)/j;
            }
            return comb;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int k = sc.nextInt();
        int diff = Math.abs(n1 - n2);
        int n = diff+1;
        int noofeven;
        int noofodd;
        
        if (n1 % 2 == 0 && n2 % 2 == 0) {
            noofodd = diff / 2;
            noofeven = n - noofodd;
        } else if (n1 % 2 == 0 && n2 % 2 != 0) {
            noofeven = n / 2;
            noofodd = n / 2;
        } else if (n1 % 2 != 0 && n2 % 2 == 0) {
            noofeven = n / 2;
            noofodd = n / 2;
        } else {
            noofeven = diff / 2;
            noofodd = n - noofeven;
        }
        
        int noofoddsum = 0;
        int i,z;
        for (i = 1; i <= k; i += 2) {
            noofoddsum += (int) Math.pow(noofodd, i) * (int) Math.pow(noofeven, k - i);
            z=kCr(k,i);
            noofoddsum=noofoddsum*z;
        }


        
        int total = (int) Math.pow(n, k);
        int result = total - noofoddsum;
        System.out.print(Math.abs(result));
    }
}
