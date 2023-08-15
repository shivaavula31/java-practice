import java.util.*;
class EMI
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double bank[]=new double[5];
    double sum;
    int l = 0;
    double p=sc.nextDouble();
    int y=sc.nextInt();
  for (int k = 0; k < 2; k++){
      int n=sc.nextInt();
      sum = 0;
      for (int i = 0; i < n; i++){
      int yrs=sc.nextInt();
      double s=sc.nextDouble();
	  double sq = Math.pow ((1 + s), yrs * 12);
	  double emi = (p * (s)) / (1 - 1 / sq);
	  sum = sum + emi;
	  }
      bank[l++] = sum;
}
if (bank[0] < bank[1])
System.out.print("Bank A");
else
System.out.print("Bank B");
}
}