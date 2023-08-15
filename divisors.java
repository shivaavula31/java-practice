import java.util.*;
class divisors{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                list1.add(i);
                list2.add(n/i);
            }
            
        }
        Collections.reverse(list2);
        System.out.print(list1+" "+list2);
    }
}