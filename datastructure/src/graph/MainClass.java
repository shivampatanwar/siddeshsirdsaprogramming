package graph;

import java.util.ArrayList;

public class MainClass {
	
	public static void main(String[] args) {
		
		ArrayList<GraphNode>  node = new ArrayList<GraphNode>();
		
		node.add(new GraphNode("A", 0));
		node.add(new GraphNode("B", 1));
		node.add(new GraphNode("C", 2));
		node.add(new GraphNode("D", 3));
		node.add(new GraphNode("E", 4));
		node.add(new GraphNode("F", 5));
		
		Graph graph = new Graph(node);
		
		graph.addUnweightedUndirectedGraph(0, 1);
		graph.addUnweightedUndirectedGraph(0, 2);
		graph.addUnweightedUndirectedGraph(1, 3);
		graph.addUnweightedUndirectedGraph(1, 4);
		graph.addUnweightedUndirectedGraph(2, 4);
		graph.addUnweightedUndirectedGraph(3, 5);
		graph.addUnweightedUndirectedGraph(4, 5);
		
		
		graph.print();
	}

}
