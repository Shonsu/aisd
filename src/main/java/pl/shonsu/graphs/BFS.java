package pl.shonsu.graphs;

import java.util.List;
import java.util.Queue;
import java.util.Set;

public class BFS {
    public static void traversingRecursiveWithFIFO(Graph graph, Queue<String> q, Set<String> visited) {
        if(q.isEmpty()){
            return;
        }
        String current = q.poll();
        if(!visited.contains(current)){
            System.out.println(current);
            visited.add(current);
            List<Vertex> vertexes = graph.getVertices().get(new Vertex(current));
            vertexes.forEach(v -> q.add(v.label));
        }
        traversingRecursiveWithFIFO(graph, q, visited);
    }
}
