//给你二叉树的根节点 root ，返回其节点值的 锯齿形层序遍历 。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。 
//
// 
//
// 示例 1： 
// 
// 
//输入：root = [3,9,20,null,null,15,7]
//输出：[[3],[20,9],[15,7]]
// 
//
// 示例 2： 
//
// 
//输入：root = [1]
//输出：[[1]]
// 
//
// 示例 3： 
//
// 
//输入：root = []
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 树中节点数目在范围 [0, 2000] 内 
// -100 <= Node.val <= 100 
// 
//
// Related Topics 树 广度优先搜索 二叉树 👍 815 👎 0


package leetcode.editor.cn;

import java.util.*;

/**
 * @id 103
 * @title 二叉树的锯齿形层序遍历
 * @author ouyang
 * @date 2023-09-14 13:26:50
 */

class P_103_BinaryTreeZigzagLevelOrderTraversal{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_103_BinaryTreeZigzagLevelOrderTraversal().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode() {}
	TreeNode(int val) { this.val = val; }
	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> ans = new LinkedList<List<Integer>>();
		if (root == null) {
			return ans;
		}

		Queue<TreeNode> nodeQueue = new ArrayDeque<TreeNode>();
		nodeQueue.offer(root);
		boolean isOrderLeft = true;

		while (!nodeQueue.isEmpty()) {
			Deque<Integer> levelList = new LinkedList<Integer>();
			int size = nodeQueue.size();
			for (int i = 0; i < size; ++i) {
				TreeNode curNode = nodeQueue.poll();
				if (isOrderLeft) {
					levelList.offerLast(curNode.val);
				} else {
					levelList.offerFirst(curNode.val);
				}
				if (curNode.left != null) {
					nodeQueue.offer(curNode.left);
				}
				if (curNode.right != null) {
					nodeQueue.offer(curNode.right);
				}
			}
			ans.add(new LinkedList<Integer>(levelList));
			isOrderLeft = !isOrderLeft;
		}

		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
