package treeGraphs;

import java.util.ArrayList;

import treeGraphs.MySolution4_4.Node;

public class MySolution4_7 {
	public static class Node{
		int data;
		Node left = null;
		Node right =  null;
		Node next = null;
		public Node(int d){
			data = d;
		}
		
	}
	
	public static boolean DFS(Node root,Node n){
		
		if(root == null){return false;}
		if(root.data == n.data){return true;}
		
		if(DFS(root.left,n) || DFS(root.right, n)){
			return true;
		}
		return false;
	}
	
	public static Node firstAncestor(Node r, Node a, Node b){
		
		if(DFS(r.left,a) && DFS(r.left,b)){//ancestor further down on left
			return firstAncestor(r.left, a, b);
		}
		
		if(DFS(r.right,a) && DFS(r.right,b)){//ancestor further down on right
			return firstAncestor(r.right, a, b);
		}
		
		//possibly at 
		
		
		return r;
	}
	

	public static void main(String[] args){
		Node Aroot = new Node(5);
		Node B= new Node(4);
		Node C =  new Node(3);
		Node D = new Node(2);
		Node E = new Node(69);
		Node F = new Node(9);
		Node G = new Node(8);
		Node H = new Node(10);
		Node I = new Node(12);
		Node J = new Node(6);
		Node K = new Node(11);
		Node L = new Node(13);
		Node M = new Node(14);
		
		//ArrayList<Integer> mylist = new ArrayList<>();
		
		Aroot.left = B;
		Aroot.right = C;
		B.left = D;
		B.right = E;
		C.left = F;
		C.right = G;
		D.left = H;
		D.right = I;
		E.left = J;
		E.right = K;
		K.left = M;
		G.left = L;
		
		Node parent = firstAncestor(Aroot,H,K);
		System.out.println("parent data is: "+parent.data);//should be 4
	}

}

