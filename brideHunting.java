import java.util.*;
class brideHunting{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> qualities=new ArrayList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int count=0;
                if(arr[i][j]==1){
                        list.add(i+1);
                        list.add(j+1);
                        if(j+1<c && arr[i][j+1]==1)
                        count++;
                        if(i+1<r && arr[i+1][j]==1)
                        count++;
                        if(i+1<r && j+1<c && arr[i+1][j+1]==1)
                        count++;
                        if(i-1>=0 && arr[i-1][j]==1)
                        count++;
                        if(j-1>=0 && arr[i][j-1]==1)
                        count++;
                        if(i-1>=0 && j-1 >=0 && arr[i-1][j-1]==1)
                        count++;
                        if(i-1>=0 && j+1<c && arr[i-1][j+1]==1)
                        count++;
                        if(i+1<r && j-1>=0 && arr[i+1][j-1]==1)
                        count++;
                        list.add(count);
                }
            }
        }
        for(int i=5;i<list.size();i+=3){
            int x=list.get(i);
            qualities.add(x);
        }
        //System.out.println(list);
        //System.out.println(qualities);
        int max=Collections.max(qualities);
        int k=-1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == max) {
                k =i;
                break;
            }
        }
        k=5+3*k;
        int x=k-2;
        int y=k-1;
        System.out.print(list.get(x)+":"+list.get(y)+":");
        System.out.print(max);
    }
}