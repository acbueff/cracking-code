package treeGraphs;
import codeLibrary.*;
/**
 * Design an algorithm and write code to find the first common ancestor
 * of two nodes in a binary tree. 
 * @author Andreas
 *
 */
public class findCommonAncestor {
	/**
	 * My first answer is based on the assumption we can access nodes parents.
	 * They are, how you say...bi-directional
	 */
	public int getDepth(TreeNode x){
		TreeNode n = x;
		int depth = 0;
		
		while(n.parent != null){
			depth++;
			n = n.parent;
		}
		return depth;
	}
	/**
	 * So this answer is correct...technically
	 * It's similar to the book solution, but it's not the best solution
	 * Its runtime is O(d) which is the depth of the tree
	 * @param p
	 * @param q
	 * @return
	 */
	public TreeNode parentFindAncestor(TreeNode p, TreeNode q){
		if(p == null || q == null){
			return null;
		}
		
		int depthP = getDepth(p);
		int depthQ = getDepth(q);
		
		if(depthP > depthQ){
			while(depthP != depthQ){
				p = p.parent;
				depthP--;
			}
		}else if(depthP < depthQ){
			while(depthP != depthQ){
				q = q.parent;
				depthQ--;
			}
		}
		
		while(p.parent != null && q.parent != null){
			if(p.parent == q.parent){
				return q.parent;//shouldnt relly matter if q or p
			}
			p.parent = p.parent.parent;
			q.parent = q.parent.parent;
		}
		return null;
		
	}

}
