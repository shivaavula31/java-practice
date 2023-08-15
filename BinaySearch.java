import java.util.*;
class binarySearch{
        static void binarysearch(int arr[],int n,int target){
            int lb=0;
            int ub=n-1;
            while(lb<ub){
               int mid=(lb+ub)/2;
               if(arr[mid]==target){
               System.out.print(mid);
               }
               else if(arr[mid]>target){
                ub=mid;
               }
               else
               lb=mid+1;
            }
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        binarysearch(arr,n,target);
    }
}