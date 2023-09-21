//给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。 
//
// 
//
// 示例 1： 
// 
// 
//输入：head = [1,2,3,4,5], k = 2
//输出：[4,5,1,2,3]
// 
//
// 示例 2： 
// 
// 
//输入：head = [0,1,2], k = 4
//输出：[2,0,1]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点的数目在范围 [0, 500] 内 
// -100 <= Node.val <= 100 
// 0 <= k <= 2 * 10⁹ 
// 
//
// Related Topics 链表 双指针 👍 981 👎 0


package leetcode.editor.cn;

import java.security.cert.CRL;

/**
 * @id 61
 * @title 旋转链表
 * @author ouyang
 * @date 2023-09-21 11:33:32
 */

class P_61_RotateList{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_61_RotateList().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
		if (k == 0 || head == null || head == null){
			return head;
		}
		int n = 1;
		ListNode cur = head;
		while(cur.next != null){
			cur = cur.next;
			n++;
		}
		int add = n - k % n;
		if (add == n) {
			return head;
		}
		cur.next = head;
		while (add-- > 0){
			cur = cur.next;
		}
		ListNode res = cur.next;
		cur.next = null;
		return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
