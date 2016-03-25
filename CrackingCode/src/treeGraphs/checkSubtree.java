package treeGraphs;
import java.util.LinkedList;

import codeLibrary.TreeNode;

public class checkSubtree {
	public static boolean checkSubtree(TreeNode root, TreeNode n){
		if(root == null || n == null){
			return false;
		}
		
		if(root == n){
			if(treeCompare(root,n)){
				return true;
			}
		}
		return checkSubtree(root.left,n)||checkSubtree(root.right,n);
	}
	
	public static boolean treeCompare(TreeNode root, TreeNode n){
		LinkedList<TreeNode> queue1 = new LinkedList<>();
		LinkedList<TreeNode> queue2 = new LinkedList<>();
		
		queue1.add(root);
		queue2.add(n);
		while(!queue1.isEmpty() && !queue2.isEmpty()){
			TreeNode node1 = queue1.pop();
			TreeNode node2 = queue2.pop();
			if(node1 != null || node2 != null){
				if(node1.equals(node2)){
					queue1.add(node1.left);
					queue1.add(node1.right);
					queue2.add(node1.left);
					queue2.add(node1.right);
				}else{
					return false;
				}
			}
		}
		return true;

	}

}
