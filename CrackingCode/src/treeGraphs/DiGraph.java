package treeGraphs;

import java.util.PriorityQueue;
import java.util.Queue;

import linkedLists.Node;


public class DiGraph {
	
	private int N = 0;
	private Queue<Node> vertex;
	
	public DiGraph(int n){
		this.N = n;
		vertex = new PriorityQueue<>();
		for(int i = 0; i< N; i++){
			vertex.add(new Node(i));
		}	
	}
	
	public int N(){ return N;}
	
	public void addNode(Node n){
		vertex.add(n);
		N++;
	}
	
	public Queue<Node> getVertex(){
		return vertex;
	}
	

}
