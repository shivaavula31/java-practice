import java.util.*;
class fibonacciUsingDp{
    public static void fib(int n){
        int f[]=new int[n];
        f[0]=0;
        f[1]=1;
        System.out.println(f[0]);
        System.out.println(f[1]);
        for(int i=2;i<n;i++){
            f[i]=f[i-1]+f[i-2];
            System.out.println(f[i]);
        }
        //return f[n];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fib(n);
    }
}