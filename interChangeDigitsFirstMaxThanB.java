import java.util.*;

class interchangeDigitsFirstMaxThanB {
    public static void printPermutations(String s, String perm, List<String> stringList) {
        if (s.length() == 0) {
            stringList.add(perm);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            String newString = s.substring(0, i) + s.substring(i + 1);
            printPermutations(newString, perm + currChar, stringList);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        int n2 = sc.nextInt();
        int n = s1.length();
        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);
        String s = new String(c1);
        List<String> stringList = new ArrayList<>();
        printPermutations(s, "", stringList);

        List<Integer> integerList = new ArrayList<>();
        for (String str : stringList) {
            Integer intValue = Integer.parseInt(str);
            integerList.add(intValue);
        }

        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) > n2) {
                System.out.print(integerList.get(i));
                break;
            }
        }
    }
}
