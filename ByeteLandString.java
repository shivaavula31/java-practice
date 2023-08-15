import java.util.*;
class ByeteLandString{
    public static void checkSuperASCII(String s){
            int b[]=new int[26];
            for(int i=0;i<s.length();i++){
                int index=(int)s.charAt(i)-97+1;
                b[index-1]++;
            } 
            for(int i=0;i<s.length();i++){
                int index=(int)s.charAt(i)-97+1;
                if(b[index-1]!=index){
                System.out.println("NO");
                return;
                }
            }
            System.out.println("YES");
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
       for(int i=0;i<n;i++){
          String s=sc.next();
          checkSuperASCII(s);
        }
    }
}