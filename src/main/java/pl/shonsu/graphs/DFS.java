package pl.shonsu.graphs;

import java.util.*;

public class DFS {
    public static void traversingIterativeLIFO(Graph graph, String root) {
        Set<String> visited = new LinkedHashSet<>();
        Stack<String> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {

            Vertex current = new Vertex(stack.pop());

            if (!visited.contains(current.label)) {
                System.out.println(current.label);
                visited.add(current.label);
                List<Vertex> adjVertex = graph.getVertices().get(current);
                Collections.reverse(adjVertex);
                adjVertex.forEach(v -> stack.push(v.label));
            }
        }
    }

    public static void traversingRecursive(Graph graph, String root, Set<String> visited) {

        if (!visited.contains(root)) {
            System.out.println(root);
            visited.add(root);
            List<Vertex> adjVertex = graph.getVertices().get(new Vertex(root));
            adjVertex.forEach(v -> traversingRecursive(graph, v.label, visited));
        }
    }
}
