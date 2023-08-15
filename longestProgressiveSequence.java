import java.util.ArrayList;
import java.util.Scanner;

public class longestProgressiveSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        ArrayList<Integer> sequence = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            int num = sc.nextInt();
            sequence.add(num);
        }
        ArrayList<Integer> longestProgressiveSequence = findLongestProgressiveSequence(sequence);
        for (int num : longestProgressiveSequence) {
            System.out.print(num + " ");
        }
    }

    public static ArrayList<Integer> findLongestProgressiveSequence(ArrayList<Integer> sequence) {
        ArrayList<Integer> longestProgressiveSequence = new ArrayList<>();
        ArrayList<Integer> currentProgressiveSequence = new ArrayList<>();

        for (int i = 0; i < sequence.size(); i++) {
            if (currentProgressiveSequence.isEmpty() || sequence.get(i) >= currentProgressiveSequence.get(currentProgressiveSequence.size() - 1)) {
                currentProgressiveSequence.add(sequence.get(i));
            } else {
                if (currentProgressiveSequence.size() > longestProgressiveSequence.size()) {
                    longestProgressiveSequence = new ArrayList<>(currentProgressiveSequence);
                }
                currentProgressiveSequence.clear();
                currentProgressiveSequence.add(sequence.get(i));
            }
        }

        if (currentProgressiveSequence.size() > longestProgressiveSequence.size()) {
            longestProgressiveSequence = new ArrayList<>(currentProgressiveSequence);
        }

        return longestProgressiveSequence;
    }
}
