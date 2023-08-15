import java.util.*;
class circularTableCombinations{
    public static void circularcombinations(int arr[], int n, int r, int index, int data[], int i,ArrayList<String> list) {
        if (index == r) {
            String s=new String();
            for (int j = 0; j < r; j++){
                s+=data[j];
                //System.out.print(data[j]);
            }
            list.add(s);
            //System.out.print("\n");
            return;
            
        }
        if (i >= n)
            return;

        data[index] = arr[i];
        circularcombinations(arr, n, r, index + 1, data, i + 1,list);
        while (i < n - 1 && arr[i] == arr[i + 1])
            i++;
        circularcombinations(arr, n, r, index, data, i + 1,list);
    }

    public static void printcombinations(int arr[], int n, int r,ArrayList<String> list) {
        int data[] = new int[r];
        circularcombinations(arr, n, r, 0, data, 0,list);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }
        Arrays.sort(arr);
        int r = n-sc.nextInt();
        int r1=n-r;
        ArrayList<String> list=new ArrayList<>();
        printcombinations(arr, arr.length, r,list);
        printcombinations(arr, arr.length, r1,list);
        System.out.print(list);
    }
}