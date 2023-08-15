import java.util.Scanner;

public  class onlineCommunitiesEvenGroups
{
    static int common[] = new int[1000001];
    static int num;
    
    void merge_common(int a,int b){
    
       for(int i=0;i<=num;i++){
        if(common[i]==b)
            common[i]=a;
        else if(common[i]>b)
            common[i]--;
    }
    }
    
    int even_group(int comNo){
    
        int count =0,temp=0;
        for(int i=1;i<comNo;i++){
            for(int j=0;j<=num;j++){
                if(common[j]==i)
                    temp++;
                }
            if(temp%2==0 && temp!=0){
                count++;
        }
        temp=0;
        }
    return count;
    }
    
    
	public static void main(String[] args) {
		
		int a,b,comNo=1;
        char ch;
        
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        
        onlineCommunitiesEvenGroups obj = new onlineCommunitiesEvenGroups();

    
        while(true){

            ch = sc.next().charAt(0);
        
            if(Character.compare(ch,'C')==0){
                
                a = sc.nextInt();
                b = sc.nextInt();
                
                if(common[a]==0 && common[b]==0){
                common[a]=common[b]=comNo;
                comNo++;
                }
                else if(common[a]==0){
                    common[a]=common[b];
                }
                else if(common[b]==0){
                    common[b]=common[a];
                }
                else if(common[a]>common[b]){
                    obj.merge_common(common[b],common[a]);
                    comNo--;
                }
                else if(common[b]>common[a]){
                    obj.merge_common(common[a],common[b]);
                    comNo--;
                }
            }
        
        else if(Character.compare(ch,'Q')==0){
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.print(obj.even_group(comNo));
        }
        
        else
            break;
        }

	}
}