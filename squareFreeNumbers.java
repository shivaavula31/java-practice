import java.util.*;
class squareFreeNumbers{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double sqnum;
    int i,j=0,flag,chksqr;
    int temp[]=new int[10000];
  	int count=0,k;
    int n=sc.nextInt();
    
    for(i=2;i<=n/2;i++)
    {
        if(n%i==0)
        {    
            count++;
            sqnum=Math.sqrt(i);
            chksqr=(int) sqnum;
            if(chksqr==sqnum)
            {
                count--;
                temp[j]=i;
                j++;
            }
            else
            {
                for(k=0;k<j;k++) 
                { 
                    if(i>temp[k] && j!=0)
                    {
                        if(i%temp[k]==0)
                        {	
                          	count--;
                        	k=j+1;
                        }
                    }
                    else
                        break;
                }
            }
        }
    }

    System.out.print(count);
    }
}

    