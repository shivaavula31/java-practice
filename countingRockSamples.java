import java.util.*;
class countingRockSamples{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<=r;i++){
            int lowlimit=sc.nextInt();
            int upperlimit=sc.nextInt();
            int count=0;
            for(int j=0;j<n;i++){
                if(arr[j]>=lowlimit && arr[j]<=upperlimit)
                count++;
            }
            System.out.print(count);
        }
        

    }
}