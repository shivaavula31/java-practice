import java.util.*;
class MinGoldenWiringCost
{
   public static int solve (int arr[], int n)
   {
       PriorityQueue <Integer> queue = new PriorityQueue<Integer>();
      
       for (int i = 0; i < n; i++)
           queue.add (arr[i]);
      
       int sum = 0, temp1, temp2;
      
       while (queue.size () >= 2)
       {
            temp1 = queue.poll ();
            temp2 = queue.poll ();
            sum += temp1 + temp2;
            queue.add (temp1 + temp2);
       }
       return sum;
   }

   public static void main (String[]args)
   {
       Scanner sc = new Scanner (System.in);
       int n = sc.nextInt ();
       int arr[] = new int[n];
  
       for (int i = 0; i < n; i++)
           arr[i] = sc.nextInt ();
      
       System.out.println (solve (arr, n));
   }
}