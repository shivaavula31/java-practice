import java.util.*;

class criticalPlanets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        
        // Create a graph to store the connections between planets
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            graph.add(new ArrayList<>());
        }
        
        // Read the paths between planets and build the graph
        for (int i = 0; i < M; i++) {
            int planet1 = sc.nextInt();
            int planet2 = sc.nextInt();
            graph.get(planet1).add(planet2);
            graph.get(planet2).add(planet1);
        }
        
        // Find the critical planets
        List<Integer> criticalPlanets = new ArrayList<>();
        for (int planet = 0; planet < N; planet++) {
            if (graph.get(planet).size() == 1) {
                criticalPlanets.add(planet);
            }
        }
        
        // Sort and print the critical planets in ascending order
        if (criticalPlanets.isEmpty()) {
            System.out.println("-1");
        } else {
            Collections.sort(criticalPlanets);
            for (int planet : criticalPlanets) {
                System.out.println(planet);
            }
        }
    }
}
