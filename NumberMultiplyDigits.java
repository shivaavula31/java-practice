import java.util.*;
public class NumberMultiplyDigits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Stack<Integer> stack=new Stack<>();
        while(a!=1){
            for(int i=9;i>1;i--){
                if(a%i==0){
                    stack.push(i);
                    a=a/i;
                }
            }
        } 
    }
}