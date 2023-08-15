import java.util.ArrayList;
import java.util.Scanner;

public class LongestProgressiveSequence1 {

	static Integer[] getResult(int[] a) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Integer[] temp = new Integer[0];
        for(int i=0;i<a.length;i++) {
        	int n=a[i];
		    if (!(arr.isEmpty())) {
	            if (n >=arr.get(arr.size()-1 )) 
	                arr.add(n);
	            else {
	                if(arr.size()>temp.length)
	                    temp=arr.toArray(temp);
	                    arr.clear();
	                    arr.add(n);
	            }
	            
	        } else {
	            arr.add(n);
	        }
        }
  
	    if(arr.size()>temp.length)
	    {
	        temp=arr.toArray(temp);
	        arr.clear();
	    }
        return temp;
	}
	
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr=new int[t];
        for (int i = 0; i < t; i++) {
            arr[i]= sc.nextInt();
        }
        for(int i:getResult(arr))
        	System.out.print(i+" ");
        
    }
}