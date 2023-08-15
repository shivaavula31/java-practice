import java.util.*;
class savingForRainyDay{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int I=sc.nextInt();
        int T=sc.nextInt();
        double R=sc.nextDouble()/100;
        int amount=I*T;
        double exp=Math.pow((1+R),T/12.0);
        double p=amount/(exp);
        System.out.print(p);
        
    }
}