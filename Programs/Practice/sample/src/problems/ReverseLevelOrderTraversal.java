package problems;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
public class ReverseLevelOrderTraversal {
   
	public void reverseLevelOrder(TreeNode root){
		
		Stack<TreeNode> stk = new Stack<>();
		Queue<TreeNode> q = new LinkedList<>();
		
		q.add(root);
		while(!q.isEmpty()){
			TreeNode node = q.peek();
			q.remove();
			stk.push(node);
			if(node.right!=null){
				q.add(node.right);
			}
			if(node.left!=null){
				q.add(node.left);
			}
			
		}
		
		while(!stk.isEmpty()){
			System.out.println("Reverse ="+ stk.pop().val);
		}
	}
	
	public static void main(String[] args){
		ReverseLevelOrderTraversal r = new ReverseLevelOrderTraversal();
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		r.reverseLevelOrder(root);
	}
}
