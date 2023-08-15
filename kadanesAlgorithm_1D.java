import java.util.*;
class kadanesAlgorithm_1D{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int max=arr[0];
        for(int i=1;i<n;i++){
            sum=sum+arr[i];
            if(sum<=0){
                sum=0;
            }
            if(max<=sum){
                max=sum;
            }
        }
        System.out.print(max);
    }
}