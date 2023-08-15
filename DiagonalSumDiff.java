import java.util.*;
class DiagonalSumDiff{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sum1=0;
        int sum2=0;
        for(int i=0;i<n;i++){
            sum1+=arr[i][i];
        }
        for(int i=0;i<n;i++){
            sum2+=arr[i][n-i-1];
        }
        int result=Math.abs(sum1-sum2);
        System.out.print(result);
    }
}