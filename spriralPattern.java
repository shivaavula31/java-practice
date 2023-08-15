import java.util.*;
class spriralPattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        int k=1;
        int fr=0;
        int lr=n-1;
        int fc=0;
        int lc=n-1;
        int x=0;

        while(x<n*n){
            for(int i=fc;i<=lc;i++){
                arr[fr][i]=k;
                k++;
                x++;
            }
            fr++;

            for(int i=fr;i<=lr;i++){
                arr[i][lc]=k;
                k++;
                x++;
            }
            lc--;
            
            for(int i=lc;i>=fc;i--){
                arr[lr][i]=k;
                k++;
                x++;
            }
            lr--;
            for(int i=lr;i>=fr;i--){
                arr[i][fc]=k;
                k++;
                x++;
            }
            fc++;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}