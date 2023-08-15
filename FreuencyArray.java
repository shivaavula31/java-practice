import java.util.Scanner;
import java.lang.*;
public class FreuencyArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]  a=new int[size];
        for(int i=0;i<a.length;i++)//dynamic initialization
            a[i]=sc.nextInt();
        
        int[] freq=new int[10];
        for(int i=0;i<a.length;i++)
        {
            freq[a[i]]++;
        }

        for(int i=0;i<a.length;i++)
        {
           if(freq[a[i]]!=-1)
            {
                System.out.print(a[i]+""+freq[a[i]]);
                freq[a[i]]=-1;
            }
        }
    }
}
