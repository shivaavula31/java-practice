import java.util.*;

class RemoveStringWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String r = sc.next();

        for (int i = 0; i < r.length(); i++) {
            char c = r.charAt(i);
            s = s.replace(Character.toString(c), "");
        }

        System.out.print(s);
    }
}
