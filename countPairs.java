import java.util.*;
class countPairs{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<n;i++){
            int x1=arr[i]-k;
            int x2=arr[i]+k;
            for(int j=0;j<n;j++){
                if(i!=j){
                    int ele=arr[j];
                    if(ele>=x1 && ele<=x2){
                    count++;
                    break;
                    }
                }
            }
        }
        System.out.print(count);
    }
}