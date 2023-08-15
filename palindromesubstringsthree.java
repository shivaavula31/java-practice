import java.util.*;
class palindromesubstringsthree{
    public static boolean isPalindrome(String s){
        StringBuilder sb=new StringBuilder(s);
        if(s.length()==1)
            return true;
        sb=sb.reverse();
        String rev=new String(sb);
        if(s.equals(rev))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int len=s.length();
        String s1="";
        String s2="";
        String s3="";
        boolean flag=false;
        for(int i=1;i<len-1;i++){
            s1=s.substring(0,i);
            if(isPalindrome(s1)){
                for(int j=1;j<len-i;j++){
                    s2=s.substring(i,i+j);
                    s3=s.substring(i+j,len);
                    if(isPalindrome(s2) && isPalindrome(s3)){
                        System.out.print(s1+"\n"+s2+"\n"+s3);
                        flag=true;
                        break;
                    }
                }
                if(flag==true)
                break;
            }
            
        }
        if(flag==false)
        System.out.println("Impossible");
    }
}