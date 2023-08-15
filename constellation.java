import java.util.*;

public class constellation {
    private static final Object[] pattern = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Move to the next line after reading the integer

        char[][] matrix = new char[3][n];
        for (int i = 0; i < 3; i++) {
            String line = scanner.nextLine();
            matrix[i] = line.toCharArray();
        }

        String stars = findGalaxyStars(matrix);
        System.out.println(stars);
    }

    public static String findGalaxyStars(char[][] matrix) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U'));
        Set<Character> galaxyStars = new LinkedHashSet<>();
        Map<Character, String[]> starPatterns = new HashMap<>();
        starPatterns.put('U', new String[]{"*.*", "***", "#.#"});
        starPatterns.put('O', new String[]{"***", "*.*", "#.#"});
        starPatterns.put('I', new String[]{"***", "*.*", "#.#"});
        starPatterns.put('E', new String[]{"***", "*..", "#.#"});
        starPatterns.put('A', new String[]{"***", "*.*", "*.*"});

        for (int col = 0; col < matrix[0].length; col++) {
            boolean newGalaxy = false;

            for (int row = 0; row < matrix.length; row++) {
                char currentChar = matrix[row][col];

                if (currentChar == '#') {
                    newGalaxy = true;
                    galaxyStars.clear();
                } else if (currentChar == '*') {
                    boolean validStar = true;

                    for (int i = 0; i < 3; i++) {
                        String pattern = String.valueOf(matrix[row + i][col]) +
                                         String.valueOf(matrix[row + i][col + 1]) +
                                         String.valueOf(matrix[row + i][col + 2]);

                        if (!starPatterns.containsValue(pattern)) {
                            validStar = false;
                            break;
                        }
                    }

                    if (validStar) {
                        for (Map.Entry<Character, String[]> entry : starPatterns.entrySet()) {
                            if (Arrays.equals(entry.getValue(), pattern)) {
                                galaxyStars.add(entry.getKey());
                                break;
                            }
                        }
                    }
                }
            }

            if (newGalaxy) {
                galaxyStars.clear();
            }
        }

        StringBuilder stars = new StringBuilder();
        for (char star : galaxyStars) {
            stars.append(star);
        }

        return stars.toString();
    }
}
