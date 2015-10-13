package treeGraphs;
/**
 * given a sorted array with unique int elements
 * write an algorithm to create a binary search tree
 * with minimal height
 * @author Andreas
 *
 */

public class MySolution4_3 {
	
	//public void printTree(NodeT n){
		
	//}
	
	
	public static NodeT heightTree(NodeT n, int T, int H, int[] x){
		//System.out.println(String.format("T = \d", T));
		System.out.println("T = "+T+";H = "+H);
		int size =  H - T;
		//size++;
		if(size == 1){
			n = new NodeT(x[H]);
			return n;
		}
		int half = T + size/2;
		n = new NodeT(x[half]);
		NodeT lNode = n.getLeftNodeT();
		NodeT rNode = n.getRightNodeT();
		n.setLeftNodeT(heightTree(lNode,T,half,x));
		n.setRightNodeT(heightTree(rNode,half,H,x));
		return n;
	}
	
	public static void main(String[] args){
		int[] x = {1,3,4,5,6,8,9,11};
		NodeT node = null;
		int T = 0;
		int H = x.length-1;
		heightTree(node,T,H,x);
		
	}
	
	
	
}
