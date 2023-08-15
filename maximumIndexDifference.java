import java.util.*;
class maximumIndexDifference{
    public static int maxindexdiff(int arr[],int n){
         int i = 0, j = n-1, res = 0; 
        while(i <= j) 
        { 
        if(arr[j] >= arr[i]) { 
        int dif = j-i; 
        i++; 
        if(res<=dif) 
        res=dif; 
        j = n-1; 
        } 
        else { 
        j--; 
        } 
        } 
        return res; 
        } 
        
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(maxindexdiff(arr,n));
    }
}