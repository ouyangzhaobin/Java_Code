//给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）。 
//
// 
//
// 示例 1： 
// 
// 
//输入：root = [3,9,20,null,null,15,7]
//输出：[[3],[9,20],[15,7]]
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
// -1000 <= Node.val <= 1000 
// 
//
// Related Topics 树 广度优先搜索 二叉树 👍 1800 👎 0


package leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @id 102
 * @title 二叉树的层序遍历
 * @author ouyang
 * @date 2023-09-14 13:22:47
 */

class P_102_BinaryTreeLevelOrderTraversal{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_102_BinaryTreeLevelOrderTraversal().new Solution();
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
    public List<List<Integer>> levelOrder(TreeNode root) {
		Queue<TreeNode> queue = new ArrayDeque<>();
		List<List<Integer>> ans = new ArrayList<>();
		if(root != null){
			queue.add(root);
		}
		while(!queue.isEmpty()){
			List<TreeNode> nodes = new ArrayList<>();
			List<Integer> list = new ArrayList<>();
			while(!queue.isEmpty()){
				nodes.add(queue.poll());
			}
			for (TreeNode treeNode : nodes) {
				list.add(treeNode.val);
				if(treeNode.left != null){
					queue.add(treeNode.left);
				}
				if(treeNode.right != null){
					queue.add(treeNode.right);
				}
			}
			ans.add(list);
		}
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
