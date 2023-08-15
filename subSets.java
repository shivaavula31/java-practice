import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class subSets {
    static void printSubsets(String s, String subset,ArrayList<String> list) {
        if (s.length() == 0) {
            list.add(subset);
            return;
        }

        // Recursive call without including the first character
        printSubsets(s.substring(1), subset,list);

        // Recursive call including the first character
        printSubsets(s.substring(1), subset + s.charAt(0),list);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<String> list=new ArrayList();
        printSubsets(s, "",list);
        Collections.sort(list);
        System.out.print(list);
    }
}
