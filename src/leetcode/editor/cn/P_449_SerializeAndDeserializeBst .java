//序列化是将数据结构或对象转换为一系列位的过程，以便它可以存储在文件或内存缓冲区中，或通过网络连接链路传输，以便稍后在同一个或另一个计算机环境中重建。 
//
// 设计一个算法来序列化和反序列化 二叉搜索树 。 对序列化/反序列化算法的工作方式没有限制。 您只需确保二叉搜索树可以序列化为字符串，并且可以将该字符串反序
//列化为最初的二叉搜索树。 
//
// 编码的字符串应尽可能紧凑。 
//
// 
//
// 示例 1： 
//
// 
//输入：root = [2,1,3]
//输出：[2,1,3]
// 
//
// 示例 2： 
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
// 树中节点数范围是 [0, 10⁴] 
// 0 <= Node.val <= 10⁴ 
// 题目数据 保证 输入的树是一棵二叉搜索树。 
// 
//
// Related Topics 树 深度优先搜索 广度优先搜索 设计 二叉搜索树 字符串 二叉树 👍 449 👎 0


package leetcode.editor.cn;

import sun.reflect.generics.tree.Tree;

import java.util.*;

/**
 * @id 449
 * @title 序列化和反序列化二叉搜索树
 * @author ouyang
 * @date 2023-09-04 10:09:46
 */

class P_449_SerializeAndDeserializeBst{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 // Solution solution = new P_449_SerializeAndDeserializeBst().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }
 class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postOrder(root,list);
        String str = list.toString();
        return str.substring(1,str.length()-1);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.isEmpty()){
            return null;
        }
        String[] arr = data.split(", ");
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            deque.push(Integer.parseInt(arr[i]));
        }
        return construct(Integer.MIN_VALUE,Integer.MAX_VALUE,deque);

    }
    private void postOrder(TreeNode root, List<Integer> list){
        if(root == null){
            return ;
        }
        postOrder(root.left,list);
        postOrder(root.right,list);
        list.add(root.val);
    }

    private TreeNode construct(int lower, int upper, Deque<Integer> deque){
        if(deque.isEmpty() || deque.peek() < lower || deque.peek() > upper){
            return null;
        }
        int val = deque.pop();
        TreeNode root = new TreeNode(val);
        root.right = construct(val,upper,deque);
        root.left = construct(lower,val,deque);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;
//leetcode submit region end(Prohibit modification and deletion)

}
