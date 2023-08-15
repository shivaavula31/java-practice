import java.util.*;
class BinaryToDecimal{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int result=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            result+=Character.getNumericValue(c)*Math.pow(2,s.length()-1-i);
        }
        System.out.println(result);        
    }
}