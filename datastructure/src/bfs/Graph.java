package bfs;

import java.util.ArrayList;

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
	
	public ArrayList<GraphNode> getNeighbours(GraphNode node){
//		var neighbour= new ArrayList<GraphNode>();
		ArrayList<GraphNode> neighbour= new ArrayList<GraphNode>();
		
		int index = node.index;
		
		for (int i = 0; i < matrix.length; i++) {
			
			if(matrix[index][i]==1) {
				
				if(!neighbour.contains(nodeList.get(i))) {
					neighbour.add(nodeList.get(i));
				}
			}
			
		}
		
		return neighbour;
	}
	
	
	public void bfsNode(GraphNode node) {
		ArrayList<GraphNode> queue = new ArrayList<GraphNode>();
		queue.add(node);
		
		while(!queue.isEmpty()) {
			GraphNode source = queue.remove(0);
			source.visit=true;
			System.out.print(source.value + "  ");
			
			ArrayList<GraphNode> neighbours = getNeighbours(source);
			
			for(GraphNode neighbour : neighbours) {
				if(!neighbour.visit) {
					queue.add(neighbour);
					neighbour.visit=true;
				}
				
			}
				
			
			
		}
		
	}
	
	public void bfs() {
		for(GraphNode node : nodeList) {
			if(!node.visit) {
				bfsNode(node);
			}
			
		}
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
