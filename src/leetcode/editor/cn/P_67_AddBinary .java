//给你两个二进制字符串 a 和 b ，以二进制字符串的形式返回它们的和。 
//
// 
//
// 示例 1： 
//
// 
//输入:a = "11", b = "1"
//输出："100" 
//
// 示例 2： 
//
// 
//输入：a = "1010", b = "1011"
//输出："10101" 
//
// 
//
// 提示： 
//
// 
// 1 <= a.length, b.length <= 10⁴ 
// a 和 b 仅由字符 '0' 或 '1' 组成 
// 字符串如果不是 "0" ，就不含前导零 
// 
//
// Related Topics 位运算 数学 字符串 模拟 👍 1093 👎 0


package leetcode.editor.cn;

/**
 * @id 67
 * @title 二进制求和
 * @author ouyang
 * @date 2023-09-06 11:43:03
 */

class P_67_AddBinary{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_67_AddBinary().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String addBinary(String a, String b) {
		StringBuffer ans = new StringBuffer();
		int aLength = a.length();
		int bLength = b.length();
		int num = 0;
		for (int i = aLength - 1, j = bLength - 1; i >= 0 || j >= 0; i--,j--) {
			int sum = num;
			sum += i >= 0 ? a.charAt(i) - '0' : 0;
			sum += j >= 0 ? b.charAt(j) - '0' : 0;
			ans.append(sum%2);
			num = sum / 2;
		}
		ans.append(num == 1 ? num : "");
		return ans.reverse().toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
