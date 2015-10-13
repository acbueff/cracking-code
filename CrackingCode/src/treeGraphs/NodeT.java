package treeGraphs;

public class NodeT {
	
	private	int data;
	
	private NodeT leftNode = null;
	private NodeT rightNode = null;
	
	public NodeT(int d){
		int data = d;
	}
	
	public void setLeftNodeT(NodeT n){
		leftNode = n;
	}
	public NodeT getLeftNodeT(){
		return leftNode;
	}
	
	public NodeT getRightNodeT(){
		return rightNode;
	}
	public void setRightNodeT(NodeT n){
		rightNode = n;
	}
	public void setData(int n){
		data = n;
	}
	public int getNodeT(){
		return data;
	}
	

}
