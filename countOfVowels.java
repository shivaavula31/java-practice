import java.util.*;
class countOfVowels{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        String[] ones={"zero","one","two","three","four","five","six","seven","eight","nine"};
        int count=0;
        for(int i=0;i<n;i++){
            int k=arr[i];
           String s="";
           s+=ones[k];
           for (int j = 0; j < s.length(); j++) {
            char c[]=s.toCharArray();
            if(c[j]=='a' || c[j]=='e' || c[j]=='i'|| c[j]=='o' || c[j]=='u' ){
                count++;
            }
           }
        }
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(count==arr[i]+arr[j]){
                    k++;
                }
            }
        }
        System.out.println(ones[k]);
    }

}