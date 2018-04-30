package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
public class ZigZagTreeTraversal {

	public List<List<Integer>> zigzagTraversal(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
		if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean zigzag = false;
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int cnt = queue.size();
            for (int i = 0; i < cnt; i++) {
                TreeNode node = queue.poll();
                if (zigzag) {
                    level.add(0, node.val);
                }
                else {
                    level.add(node.val);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            res.add(level);
            zigzag = !zigzag;
    }
		
		
		return res;
	}
	
	
	public static void main(String[] args){
		ZigZagTreeTraversal z = new ZigZagTreeTraversal();
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		z.zigzagTraversal(root);
	}
}
