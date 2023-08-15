import java.util.Scanner;
public class nonRepeated{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int count=0;
        for(int i=n1;i<=n2;i++){
            boolean visited[]=new boolean[10];
            int num=i;
            while(num>0){
                if(visited[num%10]==true){
                    break;
                }
                visited[num%10]=true;
                num/=10;
            }
            if(num==0)
            count++;
        }
        System.out.println(count);
    }
}