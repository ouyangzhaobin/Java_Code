//给定一个整数 n ，返回 n! 结果中尾随零的数量。 
//
// 提示 n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 3
//输出：0
//解释：3! = 6 ，不含尾随 0
// 
//
// 示例 2： 
//
// 
//输入：n = 5
//输出：1
//解释：5! = 120 ，有一个尾随 0
// 
//
// 示例 3： 
//
// 
//输入：n = 0
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 0 <= n <= 10⁴ 
// 
//
// 
//
// 进阶：你可以设计并实现对数时间复杂度的算法来解决此问题吗？ 
//
// Related Topics 数学 👍 790 👎 0


package leetcode.editor.cn;

/**
 * @id 172
 * @title 阶乘后的零
 * @author ouyang
 * @date 2023-09-07 11:01:00
 */

class P_172_FactorialTrailingZeroes{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_172_FactorialTrailingZeroes().new Solution();
		 System.out.println(solution.trailingZeroes(200));
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int trailingZeroes(int n) {
		int ans = 0;
		for (int i = 5; i <= n; i += 5) {
			for (int x = i; x % 5 == 0; x /= 5) {
				++ans;
			}
		}
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
