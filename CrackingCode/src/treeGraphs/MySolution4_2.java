package treeGraphs;
import java.util.LinkedList;
import java.util.Queue;

import linkedLists.Node;

public class MySolution4_2 {
	
	public static boolean search(Node s, Node d){
				
				//Queue<Node> search = new LinkedList<>();
				
				if(s.getData() == d.getData()){return true;}
				if(s.getVisited() || s.getAdjacent().isEmpty()){
					return false;
				}
				
				for(Node a : s.getAdjacent()){
					if(search( a, d)){
						return true;
					}
				}
				
				
		
		return false;
	}
	
	
	public static void main(String[] args){
		//DiGraph graph = new DiGraph(6);
		//Node S = (Ngraph.getVertex().getClass();
		Node S = new Node(1);
		Node a = new Node(2);
		Node b = new Node(3);
		Node c = new Node(4);
		Node d = new Node(5);
		Node E = new Node(6);
		S.addEdge(a);
		S.addEdge(b);
		a.addEdge(b);
		b.addEdge(c);
		c.addEdge(d);
		c.addEdge(E);
		
		if(search(S,E)){
			System.out.println("It found a path");
		}
		else{
			System.out.println("No path found");
		}
		
	}

}
