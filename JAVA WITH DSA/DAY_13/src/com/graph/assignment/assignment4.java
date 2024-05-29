package com.graph.assignment;
import java.util.*;
public class assignment4 {
	private Map<Integer, List<Integer>> adjacencyList;
	public assignment4() {
		adjacencyList = new HashMap<>();
	}
	
	public void addEdge(int u, int v) {
		adjacencyList.putIfAbsent(u, new ArrayList<>());
		adjacencyList.get(u).add(v);
	}
	
	public boolean hasCycle() {
		boolean[] visited = new boolean[adjacencyList.size()+1];
		for(int node : adjacencyList.keySet()) {
			if(!visited[node]&& hasCycleUtil(node,visited, new boolean[adjacencyList.size()+1])) {
				return true;
			}
		}
		return false;
	}
	
	private boolean hasCycleUtil(int node, boolean[] visited, boolean[] recursionStack) {
		if(recursionStack[node]) {
			return true;
		}
		
		if(visited[node]) {
			return false;
		}
		
		visited[node] = true;
		recursionStack[node] = true;
		
		if(adjacencyList.containsKey(node)) {
			for(int neighbor : adjacencyList.get(node)) {
				return true;
			}
		}
		recursionStack[node] = false;
		return false;
	}
	public static void main(String[] args) {
		assignment4 graph = new assignment4();
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		graph.addEdge(4, 1);
		
		if(graph.hasCycle()) {
			System.out.println("Adding the edge creates a cycle . edge not added.");
		}
		else {
			System.out.println("No cycle creates a cycle . Edge not successfully");
		}
	}

}


