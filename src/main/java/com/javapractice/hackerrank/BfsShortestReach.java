package com.javapractice.hackerrank;

import java.util.*;

public class BfsShortestReach {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            int nodes = scanner.nextInt();
            int edges = scanner.nextInt();

            List<Set<Integer>> adjList = new ArrayList<>(nodes + 1);
            for (int j = 0; j <= nodes; j++) {
                adjList.add(new HashSet<>());
            }

            for (int j = 0; j < edges; j++) {
                int from = scanner.nextInt();
                int to = scanner.nextInt();
                Set<Integer> neighbors = adjList.get(from);
                neighbors.add(to);
                neighbors = adjList.get(to);
                neighbors.add(from);
            }

            int start = scanner.nextInt();
            int[] shortest = findShortest(start, adjList, nodes);
            for (int j = 1; j <= nodes; j++) {
                if (j != start)
                    System.out.print(shortest[j] + " ");
            }
            System.out.println();
        }
    }

    private static int[] findShortest(int root, List<Set<Integer>> adjList, int nodes) {
        int[] pathTo = new int[nodes + 1];
        for (int i = 1; i <= nodes; i++) {
            pathTo[i] = -1;
        }
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(root);
        pathTo[root] = 0;

        while (!queue.isEmpty()) {
            int node = queue.remove();
            adjList.get(node).stream()
                    .filter(neighbor -> !visited.contains(neighbor))
                    .forEach(neighbor -> {
                        queue.add(neighbor);
                        visited.add(neighbor);
                        pathTo[neighbor] = pathTo[node] + 6;
                    });
        }

        return pathTo;
    }
}
