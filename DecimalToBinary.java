 import java.util.*;
 class DecimalToBinary{
    public static void dectobin(int n,ArrayList<Integer> list){
        while(n!=1){
            int x=n%2;
            list.add(x);
            n=n/2;
        }
        list.add(1);
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        dectobin(n,list);
    }
 }

 