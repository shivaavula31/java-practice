import java.util.*;
class maximumIndexDifference2{
    public static int maxindexdiff(int arr[],int n,ArrayList<Integer> list){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    list.add(j-i);
                }
            }
        }
        int x=Collections.max(list);
        return x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> list=new ArrayList<>();
        System.out.print(maxindexdiff(arr,n,list));
    }
}