import java.util.*;
//to print the strings with the more repeated contained string s1 words in the given input of other n input sentences.
class ascedstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s1 = sc.next();
        sc.nextLine(); // Consume the remaining newline character after reading an integer
        
        String[] sarr = new String[n];
        for (int i = 0; i < n; i++) {
            sarr[i] = sc.nextLine();
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int count = 0;
            String str = sarr[i];
            String[] words = str.split("\\s");
            for (int j = 0; j < words.length; j++) {
                if (words[j].equals(s1)) { // Use equals() for string comparison, not ==
                    count++;
                }
            }
            list.add(count);
        }
        
        int max = 0;
        int index = 0;
        while (!list.isEmpty()) { // Use !list.isEmpty() instead of list.size() >= 0
            for (int k = 0; k < list.size(); k++) {
                if (list.get(k) > max) {
                    max = list.get(k);
                    index = k;
                }
            }
            System.out.println(sarr[index]);
            list.remove(index);
            max = 0;
        }
    }
}
