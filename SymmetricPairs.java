import java.util.*;
class SymmetricPairs{
    static void pairs(int arr[][],int n){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int first=arr[i][0];
            int second=arr[i][1];

            Integer val=map.get(second);

            if(val!=null && val==first){
                System.out.print(arr[i][0]);
            }
            else{
                map.put(first,second);
            }
        }
    }
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        pairs(arr,n);
    }
}