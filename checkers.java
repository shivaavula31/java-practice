import java.util.Scanner;

public class checkers {
    public static boolean isValidMove(int[][] matrix, int i, int j, boolean[][] visited) {
        // Check if the cell is within the matrix boundaries and it's a green cell
        return i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length && matrix[i][j] == 1 && !visited[i][j];
    }

    public static int captureCells(int[][] matrix, int i, int j, boolean[][] visited, int player) {
        // Define the directions to explore adjacent cells
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        // Mark the current cell as visited
        visited[i][j] = true;

        // Count the number of cells captured by the current player
        int count = 1;

        // Explore adjacent cells
        for (int[] direction : directions) {
            int ni = i + direction[0];
            int nj = j + direction[1];
            if (isValidMove(matrix, ni, nj, visited)) {
                count += captureCells(matrix, ni, nj, visited, 1 - player);
            }
        }

        return count;
    }

    public static int calculateCellsCaptured(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        // Create a visited matrix to keep track of visited cells
        boolean[][] visited = new boolean[n][m];

        // Start the game with Mahesh (player 0)
        int player = 0;

        // Variables to store the number of cells captured by each player
        int maheshCells = 0;
        int sureshCells = 0;

        // Iterate through each cell in the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // If the cell is a green cell and not visited, start capturing cells
                if (matrix[i][j] == 1 && !visited[i][j]) {
                    int count = captureCells(matrix, i, j, visited, player);

                    // Update the number of cells captured by the current player
                    if (player == 0) {
                        maheshCells += count;
                    } else {
                        sureshCells += count;
                    }

                    // Switch players
                    player = 1 - player;
                }
            }
        }

        return sureshCells;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int sureshCells = calculateCellsCaptured(matrix);
        System.out.println(sureshCells);
    }
}
