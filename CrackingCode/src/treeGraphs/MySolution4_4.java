package treeGraphs;

import java.util.ArrayList;

public class MySolution4_4 {
	
	public static class Node{
		int data;
		Node left = null;
		Node right =  null;
		Node next = null;
		public Node(int d){
			data = d;
		}
		
	}
	
	public static ArrayList<Node> depthTree(Node n, ArrayList<Node> dlist, int d){
		int curdepth =  d;
		int nextdepth = d++;
		
		if(!dlist.isEmpty() && dlist.size()-1 >= curdepth){
			if(dlist.get(curdepth).next != null){
				n.next = dlist.get(curdepth).next;
				dlist.get(curdepth).next = n;
			}
			else{
				dlist.get(curdepth).next = n;
			}
		}
		else{dlist.add(curdepth,n);}
		
		if(n.left == null && n.right == null){
			return dlist;
		}
		
		if(n.left != null){
			depthTree(n.left,dlist,nextdepth);
		}
		if(n.right != null){
			depthTree(n.right,dlist,nextdepth);
		}
		
		return dlist;
		
	}
	
	
	
	public static void main(String[] args){
		ArrayList<Node> list = new ArrayList<>();
		
		Node root = new Node(5);
		Node l1 = new Node(4);
		Node r1 =  new Node(3);
		Node ll2 = new Node(2);
		Node lr2 = new Node(1);
		Node rl2 = new Node(9);
		Node rr2 = new Node(8);
		Node lll3 = new Node(10);
		Node llr3 = new Node(12);
		Node rlr3 = new Node(6);
		Node rrr3 = new Node(4);
		
		root.left = l1;
		root.right = r1;
		l1.left =ll2;
		l1.right=lr2;
		ll2.left = lll3;
		ll2.right = llr3;
		r1.left = rl2;
		r1.right = rr2;
		rl2.right = rlr3;
		rr2.right = rrr3;
		
		list = depthTree(root,list,0);
		for(int i = 0; i < list.size();i++){
			System.out.println("At depth:"+i);
			Node temp = list.get(i);
			while(temp.next != null){
				System.out.print("["+temp.data+"]-->");
				temp = temp.next;
			}
			System.out.print("["+temp.data+"]-->");
		}
	}

}
