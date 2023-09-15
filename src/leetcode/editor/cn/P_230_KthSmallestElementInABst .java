//给定一个二叉搜索树的根节点 root ，和一个整数 k ，请你设计一个算法查找其中第 k 个最小元素（从 1 开始计数）。 
//
// 
//
// 示例 1： 
// 
// 
//输入：root = [3,1,4,null,2], k = 1
//输出：1
// 
//
// 示例 2： 
// 
// 
//输入：root = [5,3,6,2,4,null,null,1], k = 3
//输出：3
// 
//
// 
//
// 
//
// 提示： 
//
// 
// 树中的节点数为 n 。 
// 1 <= k <= n <= 10⁴ 
// 0 <= Node.val <= 10⁴ 
// 
//
// 
//
// 进阶：如果二叉搜索树经常被修改（插入/删除操作）并且你需要频繁地查找第 k 小的值，你将如何优化算法？ 
//
// Related Topics 树 深度优先搜索 二叉搜索树 二叉树 👍 775 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;

/**
 * @id 230
 * @title 二叉搜索树中第K小的元素
 * @author ouyang
 * @date 2023-09-15 10:35:02
 */

class P_230_KthSmallestElementInABst{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_230_KthSmallestElementInABst().new Solution();
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
class Solution {
	ArrayList<TreeNode> number = new ArrayList();
    public int kthSmallest(TreeNode root, int k) {
		dfs(root);
		return number.get(k-1).val;
    }
	public void dfs(TreeNode root){
		if (root == null) {
			return ;
		}
		dfs(root.left);
		number.add(root);
		dfs(root.right);
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
