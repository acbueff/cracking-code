package linkedLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Node {
	Node next = null;
	private int data;
	private ArrayList<Node> adjacent;
	private boolean visited = false;
	
	public Node(int d){
		data = d;
		adjacent = new ArrayList<>();
		
	}
	
	public ArrayList<Node> getAdjacent(){
		return adjacent;
	}
	
	public void addEdge(Node n){
		adjacent.add(n);
	}	
	
	//public Node adjacent(int v){
		//return adjacent.at(v);
	//}
	public void visit(Node n){
		if(visited == false){
			visited = true;
		}
	}
	
	public boolean getVisited(){
		return visited;
	}

}
