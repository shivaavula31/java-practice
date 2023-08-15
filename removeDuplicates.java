import java.util.*;
class removeDuplicates{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
            set.add(arr1[i]);
        }
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
            set.add(arr2[i]);
        }
        
        System.out.print(set);
        
    }
}