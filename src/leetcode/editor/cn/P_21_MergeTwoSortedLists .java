//将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
//
// 
//
// 示例 1： 
// 
// 
//输入：l1 = [1,2,4], l2 = [1,3,4]
//输出：[1,1,2,3,4,4]
// 
//
// 示例 2： 
//
// 
//输入：l1 = [], l2 = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：l1 = [], l2 = [0]
//输出：[0]
// 
//
// 
//
// 提示： 
//
// 
// 两个链表的节点数目范围是 [0, 50] 
// -100 <= Node.val <= 100 
// l1 和 l2 均按 非递减顺序 排列 
// 
//
// Related Topics 递归 链表 👍 3269 👎 0


package leetcode.editor.cn;

import java.util.List;

/**
 * @id 21
 * @title 合并两个有序链表
 * @author ouyang
 * @date 2023-09-09 00:25:55
 */

class P_21_MergeTwoSortedLists{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_21_MergeTwoSortedLists().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 *
 */
class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if (list1 == null) {
			return list2;
		}
		else if (list2 == null) {
			return list1;
		}
		else if (list1.val < list2.val) {
			list1.next = mergeTwoLists(list1.next, list2);
			return list1;
		}
		else {
			list2.next = mergeTwoLists(list1, list2.next);
			return list2;
		}
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
