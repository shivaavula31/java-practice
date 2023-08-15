import java.util.*;

class PrimeTime {
    static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        if (num == 2)
            return true;

        if (num % 2 == 0)
            return false;

        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int duration = n / k;
        int count = 0;

        for(int i=2;i<=duration;i++){
            boolean prime_time=true;
            for(int j=0;j<k;j++){
                int num=i+j*(duration);
                if(!isPrime(num)){
                    prime_time=false;
                    break;
                }
            }
            if(prime_time){
               count+=1;     
            }
        }
        System.out.println(count);
    }
}
