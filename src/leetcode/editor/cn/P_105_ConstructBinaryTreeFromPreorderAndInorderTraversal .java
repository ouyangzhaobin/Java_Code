//给定两个整数数组 preorder 和 inorder ，其中 preorder 是二叉树的先序遍历， inorder 是同一棵树的中序遍历，请构造二叉树并
//返回其根节点。 
//
// 
//
// 示例 1: 
// 
// 
//输入: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
//输出: [3,9,20,null,null,15,7]
// 
//
// 示例 2: 
//
// 
//输入: preorder = [-1], inorder = [-1]
//输出: [-1]
// 
//
// 
//
// 提示: 
//
// 
// 1 <= preorder.length <= 3000 
// inorder.length == preorder.length 
// -3000 <= preorder[i], inorder[i] <= 3000 
// preorder 和 inorder 均 无重复 元素 
// inorder 均出现在 preorder 
// preorder 保证 为二叉树的前序遍历序列 
// inorder 保证 为二叉树的中序遍历序列 
// 
//
// Related Topics 树 数组 哈希表 分治 二叉树 👍 2074 👎 0


package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * @id 105
 * @title 从前序与中序遍历序列构造二叉树
 * @author ouyang
 * @date 2023-09-11 11:15:50
 */

class P_105_ConstructBinaryTreeFromPreorderAndInorderTraversal{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_105_ConstructBinaryTreeFromPreorderAndInorderTraversal().new Solution();
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

	public TreeNode myBuildTree(int[] preorder,int[] inorder,int preorderLeft,int preorderRight,int inorderLeft,int inorderRight){
		if(preorderLeft > preorderRight){
			return null;

		}
		int preorderRoot = preorderLeft;
		int inorderRoot = map.get(preorder[preorderRoot]);

		TreeNode root = new TreeNode(preorder[preorderRoot]);
		int leftTreeSize = inorderRoot - inorderLeft;
		root.left = myBuildTree(preorder,inorder,preorderLeft+1,preorderLeft+leftTreeSize,inorderLeft,inorderRoot-1);
		root.right = myBuildTree(preorder,inorder,preorderLeft+leftTreeSize+1,preorderRight,inorderRoot+1,inorderRight);
		return root;

	}
    public TreeNode buildTree(int[] preorder, int[] inorder) {
		int n = preorder.length;
		map = new HashMap<Integer,Integer>();
		for (int i = 0; i < n; i++) {
			map.put(inorder[i],i);
		}
		return myBuildTree(preorder,inorder,0,n-1,0,n-1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
