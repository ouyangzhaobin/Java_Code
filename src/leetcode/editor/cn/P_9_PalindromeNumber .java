//给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。 
//
// 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。 
//
// 
// 例如，121 是回文，而 123 不是。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：x = 121
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：x = -121
//输出：false
//解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
// 
//
// 示例 3： 
//
// 
//输入：x = 10
//输出：false
//解释：从右向左读, 为 01 。因此它不是一个回文数。
// 
//
// 
//
// 提示： 
//
// 
// -2³¹ <= x <= 2³¹ - 1 
// 
//
// 
//
// 进阶：你能不将整数转为字符串来解决这个问题吗？ 
//
// Related Topics 数学 👍 2655 👎 0


package leetcode.editor.cn;

/**
 * @id 9
 * @title 回文数
 * @author ouyang
 * @date 2023-09-07 10:43:27
 */

class P_9_PalindromeNumber{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_9_PalindromeNumber().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(int x) {
		String num1 = String.valueOf(x);
		StringBuffer stringBuffer = new StringBuffer(num1);
		String num2 = stringBuffer.reverse().toString();
		return num1.equals(num2);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
