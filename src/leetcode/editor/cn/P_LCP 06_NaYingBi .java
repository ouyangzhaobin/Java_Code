//桌上有 n 堆力扣币，每堆的数量保存在数组 coins 中。我们每次可以选择任意一堆，拿走其中的一枚或者两枚，求拿完所有力扣币的最少次数。 
//
// 示例 1： 
//
// 
// 输入：[4,2,1] 
// 
//
// 输出：4 
//
// 解释：第一堆力扣币最少需要拿 2 次，第二堆最少需要拿 1 次，第三堆最少需要拿 1 次，总共 4 次即可拿完。 
//
// 示例 2： 
//
// 
// 输入：[2,3,10] 
// 
//
// 输出：8 
//
// 限制： 
//
// 
// 1 <= n <= 4 
// 1 <= coins[i] <= 10 
// 
//
// Related Topics 数组 数学 👍 88 👎 0


package leetcode.editor.cn;

/**
 * @id LCP 06
 * @title 拿硬币
 * @author ouyang
 * @date 2023-09-20 12:00:42
 */

class P_LCP_06_NaYingBi{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_LCP_06_NaYingBi().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minCount(int[] coins) {
		int sum = 0;
		for (int coin : coins) {
			sum += (coin + 1) / 2;
		}
		return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
