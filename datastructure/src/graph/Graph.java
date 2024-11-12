package graph;

import java.util.ArrayList;
import java.util.Iterator;

public class Graph {
	
	ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
	int[][] matrix;
	
	
	public Graph(ArrayList<GraphNode> nodeList) {
		this.nodeList= nodeList;
		this.matrix=new int[nodeList.size()][nodeList.size()];
	}
	
	public void addUnweightedUndirectedGraph(int i, int j) {
		matrix[i][j]=matrix[j][i]=1;
	}
	
	public void print() {
		System.out.print("\n    ");
		for (int i = 0; i < nodeList.size(); i++) {
			System.out.print(nodeList.get(i).value + "  ");
		}
		
		System.out.println();
		
		for (int i = 0; i < nodeList.size(); i++) {
			
			System.out.print(" " + nodeList.get(i).value + "  ");
			
			for(int j : matrix[i]) {
				System.out.print(j + "  ");
			}
			
			
			System.out.println();
			
		}
		
	}
}
