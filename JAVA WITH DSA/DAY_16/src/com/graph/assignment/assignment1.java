
package com.graph.assignment;
import java.util.Arrays;

class Edge implements Comparable<Edge> {
    int src, dest, weight;

    public Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge compareEdge) {
        return this.weight - compareEdge.weight;
    }
}

class Graph {
    int V, E;
    Edge[] edges;

    public Graph(int v, int e) {
        V = v;
        E = e;
        edges = new Edge[e]; // Fix here
        for (int i = 0; i < e; ++i)
            edges[i] = new Edge(0, 0, 0);
    }

    int find(int[] parent, int i) {
        if (parent[i] == i)
            return i;
        return find(parent, parent[i]);
    }

    void union(int[] parent, int x, int y) {
        int xRoot = find(parent, x);
        int yRoot = find(parent, y);
        parent[xRoot] = yRoot;
    }

    void kruskalMST() {
        Edge[] result = new Edge[V];
        int e = 0;
        int i = 0;
        for (i = 0; i < V; ++i)
            result[i] = new Edge(0, 0, 0);

        Arrays.sort(edges);

        int[] parent = new int[V];
        for (i = 0; i < V; ++i)
            parent[i] = i;

        i = 0;
        while (e < V - 1) {
            Edge nextEdge = edges[i++];

            int x = find(parent, nextEdge.src);
            int y = find(parent, nextEdge.dest);

            if (x != y) {
                result[e++] = nextEdge;
                union(parent, x, y);
            }
        }

        System.out.println("Minimum Spanning Tree:");
        for (i = 0; i < e; ++i)
            System.out.println(result[i].src + " - " + result[i].dest + ": " + result[i].weight);
    }
}

public class assignment1 {
    public static void main(String[] args) {
        int V = 4;  // Number of vertices
        int E = 5;  // Number of edges

        Graph graph = new Graph(V, E);

        // Add edge 0-1
        graph.edges[0] = new Edge(0, 1, 10);
        // Add edge 0-2
        graph.edges[1] = new Edge(0, 2, 6);
        // Add edge 0-3
        graph.edges[2] = new Edge(0, 3, 5);
        // Add edge 1-3
        graph.edges[3] = new Edge(1, 3, 15);
        // Add edge 2-3
        graph.edges[4] = new Edge(2, 3, 4);

        graph.kruskalMST();
    }
}
