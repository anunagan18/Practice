package problems;

import java.util.List;
import java.util.ArrayList;

import java.util.LinkedList;
public class LeftSideView {

	public List<Integer> leftSideView(TreeNode root){
		if(root == null)return null;
	ArrayList<Integer> result = new ArrayList<>();	
 	LinkedList<TreeNode> queue = new LinkedList<>();
	queue.add(root);
	
	while(!queue.isEmpty()){
		int size = queue.size();
		
		for(int i =0;i<size;i++){
			TreeNode curr = queue.poll();
			if(i==0){
				result.add(curr.val);
			}
			
			if(curr.left!=null){
				queue.add(curr.left);
			}
			if(curr.right!=null){
				queue.add(curr.right);
			}
		}
	}
	
	return result;
	 	
	}
	
	public static void main(String[] args){
		LeftSideView r = new LeftSideView();
		TreeNode root  = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode (5);
		root.left.right = new TreeNode(6);
		List<Integer> result = r.leftSideView(root);
		System.out.println("Result" + result);
	}
}
