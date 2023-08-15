import java.util.Scanner;

public class twosumII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        sc.close();
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (arr[i] + arr[j] < target) {
                i++;
            } else if (arr[i] + arr[j] > target) {
                j--;
            } else {
                System.out.println(i + " " + j);
                i++;
                j--;
            }
        }
    }
}


/*import java.util.*;
public class Main
{
    static int[] twosum(int arr[],int n,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int res=target-arr[i];
            if(map.containsKey(res)){
                return new int[]{map.get(res),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        sc.close();
        int indices[]=twosum(arr,n,target);
        for(int i=0;i<indices.length;i+=2)
		System.out.println(indices[i]+" "+indices[i+1]);
	}
}
 */