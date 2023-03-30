package pl.shonsu.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private Map<Vertex, List<Vertex>> vertices;

    public Graph() {
        vertices = new HashMap<>();
    }

    public Graph(Map<String, List<String>> data) {
        vertices = new HashMap<>();
        data.forEach((key, value) -> {
            addVertex(key);
            value.forEach(v -> {
                if (!getVertices().containsKey(new Vertex(v))) {
                    addVertex(v);
                }
                addEdge(key, v);
            });
        });
    }

    public Map<Vertex, List<Vertex>> getVertices() {
        return vertices;
    }

    public void setVertices(Map<Vertex, List<Vertex>> vertices) {
        this.vertices = vertices;
    }


    void addVertex(String label) {
        vertices.putIfAbsent(new Vertex(label), new ArrayList<>());
    }

    void removeVertex(String label) {
        Vertex v = new Vertex(label);
        vertices.values()
                .forEach(e -> e.remove(v));
        vertices.remove(v);
    }

    void addEdge(String first, String second) {
        Vertex firstVertex = new Vertex(first);
        Vertex secondVertex = new Vertex(second);
        vertices.get(firstVertex).add(secondVertex);
        vertices.get(secondVertex).add(firstVertex);
    }

    void removeEdge(String first, String second) {
        Vertex fV = new Vertex(first);
        Vertex sV = new Vertex(second);
        List<Vertex> efV = vertices.get(fV);
        List<Vertex> esV = vertices.get(sV);

        if (efV != null) {
            efV.remove(sV);
        }
        if (esV != null) {
            esV.remove(fV);
        }
    }
}
