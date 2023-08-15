import java.util.Scanner;

class StringReplacing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        String word3 = sc.nextLine();

        String manipulatedWord1 = manipulateVowels(word1);
        String manipulatedWord2 = manipulateConsonants(word2);
        String manipulatedWord3 = manipulateToUpperCase(word3);

        String result = manipulatedWord1 + manipulatedWord2 + manipulatedWord3;
        System.out.println(result);
    }

    private static String manipulateVowels(String word1) {
        return word1.replaceAll("[AEIOUaeiou]", "*");
    }

    private static String manipulateConsonants(String word2) {
        return word2.replaceAll("[^AEIOUaeiou\\d]", "@");
    }

    private static String manipulateToUpperCase(String word3) {
        return word3.toUpperCase();
    }
}
