import java.util.*;
public class CharReplace  {
    public static void main(String[] args) {
        String originalString = "apples";
        char ch1 = 'a';
        char ch2 = 'p';

        String modifiedString = replaceChars(originalString, ch1, ch2);
        System.out.println("Original: " + originalString);
        System.out.println("Modified: " + modifiedString);
    }

    public static String replaceChars(String str, char ch1, char ch2) {
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ch1) {
                charArray[i] = ch2;
            } else if (charArray[i] == ch2) {
                charArray[i] = ch1;
            }
        }

        return new String(charArray);
    }
}
