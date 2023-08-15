import java.util.*;
class minimizeSum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        ArrayList<Integer> list=new  ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        for(int i=1;i<=k;i++){
            int max=Collections.max(list);
            int div=max/2;
            int index=list.indexOf(max);
            list.set(index,div);
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=list.get(i);
        }
        System.out.print(sum);
    }
}