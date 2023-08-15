import java.util.*;
class kanpSack
{
     public static int solve(int c,int p[],int v[],int n)
     {
          if(n==0 || c==0)
                return 0;
          if(c<p[n-1])
              return solve(c,p,v,n-1);
          else
              return Math.max(solve(c,p,v,n-1),v[n-1]+solve(c-p[n-1],p,v,n-1));
     }
      public static void main(String[] args)
      {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int c=sc.nextInt();
            int p[]=new int[n];
            int v[]=new int[n];
          
            for(int i=0;i<n;i++)
                   p[i]=sc.nextInt();
            for(int i=0;i<n;i++)
                   v[i]=sc.nextInt();
             System.out.println(solve(c,p,v,n));
      }
}