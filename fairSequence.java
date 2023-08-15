    import java.util.*;
    class fairSequence{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
        Arrays.sort(arr);
        ArrayList<Integer> neglist=new ArrayList<>();
        ArrayList<Integer> poslist=new ArrayList<>();
        ArrayList<Integer> sum=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(arr[i]<0)
                neglist.add(arr[i]);
                else
                poslist.add(arr[i]);
            }
        Collections.reverse(neglist);
        Collections.reverse(poslist);
        int length=Math.min(neglist.size(),poslist.size());
        for(int i=0;i<length;i++){
            int k=poslist.get(i)+neglist.get(i);
            sum.add(k);
        }
        int result=0;
        for(int i=0;i<sum.size();i++){
            if(sum.get(i)>0){
                result+=sum.get(i);
            }
        }
        System.out.print(result);
        }
    }