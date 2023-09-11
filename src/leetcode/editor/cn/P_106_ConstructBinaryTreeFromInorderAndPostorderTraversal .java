//给定两个整数数组 inorder 和 postorder ，其中 inorder 是二叉树的中序遍历， postorder 是同一棵树的后序遍历，请你构造并
//返回这颗 二叉树 。 
//
// 
//
// 示例 1: 
// 
// 
//输入：inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]
//输出：[3,9,20,null,null,15,7]
// 
//
// 示例 2: 
//
// 
//输入：inorder = [-1], postorder = [-1]
//输出：[-1]
// 
//
// 
//
// 提示: 
//
// 
// 1 <= inorder.length <= 3000 
// postorder.length == inorder.length 
// -3000 <= inorder[i], postorder[i] <= 3000 
// inorder 和 postorder 都由 不同 的值组成 
// postorder 中每一个值都在 inorder 中 
// inorder 保证是树的中序遍历 
// postorder 保证是树的后序遍历 
// 
//
// Related Topics 树 数组 哈希表 分治 二叉树 👍 1097 👎 0


package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * @id 106
 * @title 从中序与后序遍历序列构造二叉树
 * @author ouyang
 * @date 2023-09-11 11:31:19
 */

class P_106_ConstructBinaryTreeFromInorderAndPostorderTraversal{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_106_ConstructBinaryTreeFromInorderAndPostorderTraversal().new Solution();
		 int[] inorder = {9,3,15,20,7};
		 int[] postorder = {9,15,7,20,3};
		 System.out.println(solution.buildTree(inorder, postorder));
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
	private Map<Integer,Integer> map;

	public TreeNode myBuildTree(int[] inorder,int[] postorder,int inorderLeft,int inorderRight,int postorderLeft,int postorderRight) {
		if(postorderLeft > postorderRight){
			return null;
		}
		if(inorderLeft > inorderRight){
			return null;
		}
		int postorderRoot = postorderRight;
		int inorderRoot = map.get(postorder[postorderRoot]);
		TreeNode root = new TreeNode(postorder[postorderRoot]);
		int leftTreeSize = inorderRoot - inorderLeft;
		root.left = myBuildTree(inorder,postorder,inorderLeft,inorderRoot-1,postorderLeft,postorderLeft+leftTreeSize-1);
		root.right = myBuildTree(inorder,postorder,inorderRoot+1,inorderRight,postorderLeft+leftTreeSize,postorderRight-1);
		return root;
	}

	public TreeNode buildTree(int[] inorder, int[] postorder) {
		int n = inorder.length;
		map = new HashMap<Integer,Integer>(n);
		for (int i = 0; i < n; i++) {
			map.put(inorder[i],i);
		}
		return myBuildTree(inorder,postorder,0,n-1,0,n-1);
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
