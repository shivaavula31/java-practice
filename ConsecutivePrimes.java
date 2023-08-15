import java.util.*;
class ConsecutivePrimes{
    static boolean isPrime(int n){
        if(n==2)
        return true;
        if(n%2==0)
        return false;
        for(int i=3;i*i<=n;i+=2){
            if(n%i==0)
            return false;
        }
        return true ;
    }
    static void primeNumbers(int n,ArrayList<Integer> list){
        for(int i=3;i<n;i+=2){
            if(isPrime(i)==true){
                list.add(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        primeNumbers(n,list);
        int sum=0;
        int count=0;
        int i=0;
        while(sum<=n) {
			sum+=list.get(i);
			i++;
			if(Collections.binarySearch(list, sum)>=0)
				count++;
		}
        System.out.print(count);
    }
}