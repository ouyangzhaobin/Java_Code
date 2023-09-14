//给定一个二叉树的 根节点 root，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。 
//
// 
//
// 示例 1: 
//
// 
//
// 
//输入: [1,2,3,null,5,null,4]
//输出: [1,3,4]
// 
//
// 示例 2: 
//
// 
//输入: [1,null,3]
//输出: [1,3]
// 
//
// 示例 3: 
//
// 
//输入: []
//输出: []
// 
//
// 
//
// 提示: 
//
// 
// 二叉树的节点个数的范围是 [0,100] 
// 
// -100 <= Node.val <= 100 
// 
//
// Related Topics 树 深度优先搜索 广度优先搜索 二叉树 👍 948 👎 0


package leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @id 199
 * @title 二叉树的右视图
 * @author ouyang
 * @date 2023-09-14 10:44:10
 */

class P_199_BinaryTreeRightSideView{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_199_BinaryTreeRightSideView().new Solution();
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
    public List<Integer> rightSideView(TreeNode root) {
		Queue<TreeNode> queue = new ArrayDeque<>();
		List<Integer> ans = new ArrayList<>();
		if(root != null){
			queue.add(root);
		}

		while(!queue.isEmpty()){
			List<TreeNode> nodes = new ArrayList<>();
			while(!queue.isEmpty()){
				nodes.add(queue.poll());
			}
			int temp = nodes.get(0).val;
			for (TreeNode treeNode : nodes) {
				temp = treeNode.val;
				if(treeNode.left != null){
					queue.add(treeNode.left);
				}
				if(treeNode.right != null){
					queue.add(treeNode.right);
				}
			}
			ans.add(temp);
		}
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
