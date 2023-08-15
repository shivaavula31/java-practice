import java.util.*;
public class RemoveEleFromArr1AndArr2
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int m=sc.nextInt();
	    int arr1[]=new int[n];
	    int arr2[]=new int[m];
	    for(int i=0;i<n;i++){
	        arr1[i]=sc.nextInt();
	    }
	    for(int i=0;i<m;i++){
	        arr2[i]=sc.nextInt();
	    }
	    Set<Integer> set=new HashSet<>();
	    
	    for(int i=0;i<n;i++){
	        set.add(arr1[i]);
	    }
	    
	    for(int i=0;i<m;i++){
	        set.add(arr2[i]);
	    }
	    
	    
	    ArrayList<Integer> list=new ArrayList<>();
	    
	    for(int i=0;i<n;i++){
	        int ele=arr1[i];
	        for(int j=0;j<m;j++){
	            if(ele==arr2[j]){
	                list.add(ele);
	            }
	        }
	    }
	    
	    set.removeAll(list);
	    
	    for(Integer i:set)
		System.out.print(i+" ");
		System.out.println(set.size());
	}
}
