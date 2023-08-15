import java.util.*;
class krotatedarr{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       } 
       int k=sc.nextInt();
       int narr[]=new int[n];
       for(int i=0;i<k;i++){
        narr[i]=arr[n-k+i];
       }
       for(int i=k;i<=n-k;i++){
        narr[i]=arr[i];
       }
       for(int i=0;i<n;i++){
        System.out.print(narr[i]+" ");
       }
    }
}