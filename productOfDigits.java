import java.util.*;
class productOfDigts{
    public static int isprime(int n){
        for(int i = 2; i<=Math.sqrt(n); i++){
          if(n%i==0)
            return 0;
        }
  
        return 1;
     }
     public static void primeFactors(int n,ArrayList<Integer> list)
     {
  
        for(int i = 2; i<= n; i++){
            if(isprime(i)==1){
               int x = n;
               while(x%i==0){
                 list.add(i);
                  x /= i;
               }
            }
         }
  
     }




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        primeFactors(n,list);
        String s = list.toString();
        s = s.substring(1, s.length() - 1);
        String[] s1=new String[s.length()];
        s1[0]=s.substring(1);
        for(int i=1;i<s.length();i++){
            s1[i]=s.substring(i, s.length()-1);
        }
        System.out.println(s1);
    }
}