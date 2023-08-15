import java.util.*;
class permutations{
    public static void printpermutations(String s,String perm){
        if(s.length()==0){
            System.out.print(perm+" ");
            return;
        }
        for(int i=0;i<s.length();i++){
            char currchar=s.charAt(i);
            String newString=s.substring(0,i)+s.substring(i+1);
            printpermutations(newString,perm+currchar);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        printpermutations(s,"");
    }
}