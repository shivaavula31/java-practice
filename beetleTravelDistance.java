import java.util.Scanner;

public class beetleTravelDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the total number of points visited by the beetle
        int N = scanner.nextInt();

        // Read the coordinates of the points visited by the beetle
        double[] coordinates = new double[3 * N];
        for (int i = 0; i < 3 * N; i++) {
            coordinates[i] = scanner.nextDouble();
        }

        // Initialize total distance traveled
        double totalDistance = 0.0;

        // Iterate over the points visited by the beetle
        for (int i = 0; i < 3 * N - 3; i += 3) {
            double x1 = coordinates[i];
            double y1 = coordinates[i + 1];
            double z1 = coordinates[i + 2];

            double x2 = coordinates[i + 3];
            double y2 = coordinates[i + 4];
            double z2 = coordinates[i + 5];

            // Calculate distance between consecutive points
            double distance;
            if (z1 == z2) {
                // Points on the same face (arc length)
                distance = Math.PI / 3.0;
            } else {
                // Points on different faces (straight line distance)
                distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
            }

            // Round the distance to two decimal places
            distance = Math.round(distance * 100.0) / 100.0;

            // Add the rounded distance to the total distance traveled
            totalDistance += distance;
        }

        // Print the total distance traveled by the beetle
        System.out.printf("%.2f%n", totalDistance);
    }
}
