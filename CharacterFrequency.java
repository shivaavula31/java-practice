import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        String input = "Helloworld";
        Map<Character, Integer> frequencyMap = calculateCharacterFrequency(input);

        // Print the frequency of each character
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' occurs " + entry.getValue() + " times");
        }
    }

    public static Map<Character, Integer> calculateCharacterFrequency(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Iterate through each character in the string
        for (char c : str.toCharArray()) {
            // If the character is already present in the map, increment its count
            if (frequencyMap.containsKey(c)) {
                frequencyMap.put(c, frequencyMap.get(c) + 1);
            } else {
                // Otherwise, add the character to the map with count 1
                frequencyMap.put(c, 1);
            }
        }

        return frequencyMap;
    }
}
