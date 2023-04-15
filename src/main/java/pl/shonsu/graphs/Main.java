package pl.shonsu.graphs;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Graph graph;
        Map<String, List<String>> data = new java.util.HashMap<>(Map.ofEntries(
                Map.entry("0", List.of("1", "5")),
                Map.entry("1", List.of("2", "4")),
                Map.entry("2", List.of("3")),
                Map.entry("5", List.of("6")),
                Map.entry("6", List.of("7")),
                Map.entry("13", List.of("14", "15", "16")),
                Map.entry("15", List.of("18", "19")),
                Map.entry("8", List.of("9", "10"))
        ));
        graph = new Graph(data);

//        DFS.traversingIterativeLIFO(graph, "0");
//
//        DFS.traversingRecursive(graph, "0", new HashSet<String>());
        Queue<String> q = new LinkedList<>();
        q.add("0");
        BFS.traversingRecursiveWithFIFO(graph, q, new HashSet<String>());


    }

}
