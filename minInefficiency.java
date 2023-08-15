import java.util.HashSet;
import java.util.Scanner;
class minInefficiency{
    public static int minineff(int arr[],int cost,int n,int duplicates){
        if(cost==1){
            return duplicates+1;
        }
        else{
            return cost+duplicates+1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int cost=sc.nextInt();
        int nonduplicates=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        nonduplicates=set.size();
        int duplicates=n-nonduplicates;
        int min=minineff(arr,cost,n,duplicates);
        System.out.print(min);
    }
}


       
