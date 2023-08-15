import java.util.*;
class printStairPaths{
    static void stairPaths(int n,String path){
        if(n<0)
        return;
        if(n==0){
        System.out.println(path);
        }
        stairPaths(n-1,path+"1");
        stairPaths(n-2,path+"2");
        // here in problem it is given max of 2 steps can be climbed at a time otherwise it would go as below
        //stairPaths(n-3,path+"3");
        //stairPaths(n-4,path+"4");

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        stairPaths(n,"");
    }
}