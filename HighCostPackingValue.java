import java.util.*;
class HighCostPackingValue
{
     public static int solve(int c,int w[],int val[],int n)
     {
          if(n==0 || c==0)
                return 0;
          if(c<w[n-1])
              return solve(c,w,val,n-1);
          else
              return Math.max(solve(c,w,val,n-1),val[n-1]+solve(c-w[n-1],w,val,n-1));
     }
      public static void main(String[] args)
      {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int c=sc.nextInt();
            int v[]=new int[n];
            int w[]=new int[n];
          
            for(int i=0;i<n;i++)
                   v[i]=sc.nextInt();
            for(int i=0;i<n;i++)
                   w[i]=sc.nextInt();
             System.out.println(solve(c,w,v,n));
      }
}