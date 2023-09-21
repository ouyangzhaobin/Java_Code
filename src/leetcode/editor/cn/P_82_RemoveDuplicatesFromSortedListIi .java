//给定一个已排序的链表的头 head ， 删除原始链表中所有重复数字的节点，只留下不同的数字 。返回 已排序的链表 。 
//
// 
//
// 示例 1： 
// 
// 
//输入：head = [1,2,3,3,4,4,5]
//输出：[1,2,5]
// 
//
// 示例 2： 
// 
// 
//输入：head = [1,1,1,2,3]
//输出：[2,3]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点数目在范围 [0, 300] 内 
// -100 <= Node.val <= 100 
// 题目数据保证链表已经按升序 排列 
// 
//
// Related Topics 链表 双指针 👍 1183 👎 0


package leetcode.editor.cn;

import java.util.List;
import java.util.zip.CRC32;

/**
 * @id 82
 * @title 删除排序链表中的重复元素 II
 * @author ouyang
 * @date 2023-09-21 11:07:03
 */

class P_82_RemoveDuplicatesFromSortedListIi{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_82_RemoveDuplicatesFromSortedListIi().new Solution();
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
    public ListNode deleteDuplicates(ListNode head) {
		ListNode pre = new ListNode(0,head);
		ListNode cur = pre;
		if (head == null) {
			return null;
		}
		while(cur.next != null && cur.next.next != null){
			if (cur.next.val == cur.next.next.val){
				int x = cur.next.val;
				while (cur.next != null && cur.next.val == x){
					cur.next = cur.next.next;
				}
			}else {
				cur = cur.next;
			}
		}
		return pre.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
