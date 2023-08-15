import java.util.*;
public class circularTableCombinationsCount
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        int tables = 0,people;
        while (testcases-->0)
            tables = scanner.nextInt();
            people = scanner.nextInt();
            System.out.println(find(tables,people));
    }
    public static int find(int r,int n)
    {
        int x = n/r;
        int y1 = n%r;
        int x1 = 0;
        int ans1 = 1;
        while(r!=0)
        {
            if(y1>0)
            {
                x1 = x+1;
                y1 = y1-1;
            }
            else
            {
                x1 = x;
            }
            ans1 = ans1*combination(n,x1);
            n = n-x1;
            r--;
        }
        return ans1;
    }
    public static int factorial(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        return n * factorial(n-1);
    }
    public static int combination(int n,int r)
    {
        return factorial(n)/(factorial(n-r)*factorial(r));
    }
}