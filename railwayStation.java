import java.util.*;
// greedy algorithm
class railwayStation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arrival[]=new int[n];
        int waiting[]=new int[n];
        int departure[]=new int[n];
        for(int i=0;i<n;i++){
            arrival[i]=sc.nextInt();
            waiting[i]=sc.nextInt();
            departure[i]=arrival[i]+waiting[i];
        }
        Arrays.sort(arrival);
        Arrays.sort(departure);
        ArrayList<Integer> list=new ArrayList<>();
        int i = 1, j = 0, platform = 1;
        while (i < n && j < n)
        {
	        if (arrival[i] <= departure[j])
        	{
                platform++;
                list.add(platform);
                i++;
            }
        	else if (arrival[i] > departure[j])
    	    {
                platform--;
                list.add(platform);
                j++;
            }
        }
        int minReqPlatforms=Collections.min(list);
        System.out.println (minReqPlatforms);
    }
}