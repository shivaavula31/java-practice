import java.util.*;
class sqrtOfNumber{
    public static double sqno(double n){
        int count=50;
        double max=n;
        double min=0;
        while(count!=0){
            double temp=(min+max)/2;
            if(temp*temp==n)
            return temp;
            else if(temp*temp>n)
            max=temp;
            else
            min=temp;
            count--;
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        System.out.print(sqno(n));
    
    }
}