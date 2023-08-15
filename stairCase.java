import java.util.Scanner;
public class stairCase {
 //fibonnaci series application important and see all the type of application problems and optimizations
 // this fibonacci problems can be done by (n-1)!/(r-1)!*(n-r-1)!
     static int path(int m , int n) {
         if(m==1 || n==1) 
             return 1;
         
         return path(m-1,n)+path(m,n-1);
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         System.out.println(path(n-1,n-1));
        
    }
 
}