import java.util.Scanner;
public class maxSumOfNonAdjacentValues {

    static int prep(int hval[],int n) {
        if(n==0)
            return 0;
        if(n==1)
            return hval[0];
        if(n==2)
            return Math.max(hval[0],hval[1]);

        int[] dp = new int[n];
        dp[0]=hval[0];
        dp[1]=Math.max(hval[0],hval[1]);

        for (int i = 2; i < n; i++) {
            dp[i]=Math.max(hval[i]+dp[i-2],dp[i-1]);
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n=sc.nextInt();
        int hval[] = new int[n];
        for(int i=0;i<n;i++){
            hval[i]=sc.nextInt();
        }
        System.out.println("Max loot value :"+prep(hval,n));
    }

}

/*// Java program to find the maximum stolen value
import java.io.*;
class GFG {
	// Function to calculate the maximum stolen value
	static int maxLoot(int hval[], int n)
	{
		if (n == 0)
			return 0;

		int value1 = hval[0];
		if (n == 1)
			return value1;

		int value2 = Math.max(hval[0], hval[1]);
		if (n == 2)
			return value2;

		// contains maximum stolen value at the end
		int max_val = 0;

		// Fill remaining positions
		for (int i = 2; i < n; i++) {
			max_val = Math.max(hval[i] + value1, value2);
			value1 = value2;
			value2 = max_val;
		}

		return max_val;
	}

	// driver program
	public static void main(String[] args)
	{
		int hval[] = { 6, 7, 1, 3, 8, 2, 4 };
		int n = hval.length;
		System.out.println("Maximum loot possible : "
						+ maxLoot(hval, n));
	}
}
 */


 /*/*package whatever //do not write package name here 

// Java program to find the maximum stolen value
import java.io.*;
import java.util.Arrays;

class GFG {
// Function to calculate the maximum stolen value
static int maxLoot(int hval[], int n, int dp[])
{
	// base case
	if (n < 0) {
	return 0;
	}

	if (n == 0) {
	return hval[0];
	}
	// If the subproblem is already solved
	// then return its value
	if (dp[n] != -1) {
	return dp[n];
	}

	// if current element is pick then previous cannot
	// be picked
	int pick = hval[n] + maxLoot(hval, n - 2, dp);
	// if current element is not picked then previous
	// element is picked
	int notPick = maxLoot(hval, n - 1, dp);

	// return max of picked and not picked
	return dp[n] = Math.max(pick, notPick);
}

// Driver program
public static void main(String[] args)
{
	int hval[] = { 6, 7, 1, 3, 8, 2, 4 };
	int n = hval.length;
	int dp[] = new int[n + 1];
	Arrays.fill(dp, -1);
	System.out.println("Maximum loot possible : "
					+ maxLoot(hval, n - 1, dp));
}
}

// This code is contributed by sanskar84.
 */