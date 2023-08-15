import java.util.*;
class minDistance{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int va=sc.nextInt();
        int vb=sc.nextInt();
        double result=0;
        result =Math.sqrt(a*a+b*b);
        while(a>=0 || b>=0){
            a=a-va;
            b=b-vb;
            double x=Math.sqrt(a*a+b*b);
            if(x<result)
                     result = x;

        }
        System.out.print(result);
    }
}