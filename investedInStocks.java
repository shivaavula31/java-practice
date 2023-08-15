import java.util.*;
class investedInStocks{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int mid;
        if(n%2==0){
            mid=n/2-1;
        }
        else{
           mid=n/2;
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<=mid;i++){
            int end=arr[n-i-1]-k;
            int start=arr[i]+k;
            list.add(start);
            list.add(end);
        }
        int min=Collections.min(list);
        int max=Collections.max(list);
        int result=max-min;
        System.out.print(result);
    }
}