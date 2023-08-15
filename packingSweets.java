import java.util.*;

class PackingSweets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<int[]> arrlist = new ArrayList<int[]>();

        while (t > 0) { 
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            arrlist.add(arr);
            t--;
        }

        for (int i = 0; i < arrlist.size(); i++) { 
            HashSet<Integer> set = new HashSet<>();
            int s = arrlist.get(i).length;
            int[] data = arrlist.get(i);
            for (int j = 0; j < s; j++) {
                int ele = data[j];
                set.add(ele);
            }
            int duplicate = s - set.size();
            int count=s-duplicate;
            if (count == 4)
                System.out.println(s + 1);
            else if (count == 5)
                System.out.println(s + 2);
            else if (count >= 6)
                System.out.println(s + 4);
            else
                System.out.println(s);
        }
    }
}
