import java.util.Scanner;
public class prisonertsTreat{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int arr[] = new int [T];
        int i = 0;
        while (T-- > 0) {
            int N = scan.nextInt();
            int M = scan.nextInt();
            int S = scan.nextInt();
            int last = ((M - 1) + (S - 1)) % N + 1;
            arr[i] = last;
            i+=1;
        }
        scan.close();
        for(int z=0;z<arr.length;z++) {  
            System.out.println(arr[z]); 
        }
    }
}