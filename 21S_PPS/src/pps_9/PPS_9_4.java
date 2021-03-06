package pps_9;

//https://leetcode.com/problems/merge-two-binary-trees/

public class PPS_9_4 {
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) { 
        return merge(t1, t2); 
    } 
     
    public TreeNode merge(TreeNode t1, TreeNode t2) { 
        if (t1 == null) return t2; 
        if (t2 == null) return t1; 
         
        t1.val += t2.val;
        t1.left = merge(t1.left, t2.left); 
        t1.right = merge(t1.right, t2.right); 
         
        return t1; 
    } 
}
