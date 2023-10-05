//给定一个整数数组
// prices，其中第 prices[i] 表示第 i 天的股票价格 。 
//
// 设计一个算法计算出最大利润。在满足以下约束条件下，你可以尽可能地完成更多的交易（多次买卖一支股票）: 
//
// 
// 卖出股票后，你无法在第二天买入股票 (即冷冻期为 1 天)。 
// 
//
// 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。 
//
// 
//
// 示例 1: 
//
// 
//输入: prices = [1,2,3,0,2]
//输出: 3 
//解释: 对应的交易状态为: [买入, 卖出, 冷冻期, 买入, 卖出] 
//
// 示例 2: 
//
// 
//输入: prices = [1]
//输出: 0
// 
//
// 
//
// 提示： 
//
// 
// 1 <= prices.length <= 5000 
// 0 <= prices[i] <= 1000 
// 
//
// Related Topics 数组 动态规划 👍 1618 👎 0


package leetcode.editor.cn;

/**
 * @id 309
 * @title 买卖股票的最佳时机含冷冻期
 * @author ouyang
 * @date 2023-10-05 11:35:09
 */

class P_309_BestTimeToBuyAndSellStockWithCooldown{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_309_BestTimeToBuyAndSellStockWithCooldown().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfit(int[] prices) {
		int length = prices.length;
		if (length == 0) {
			return 0;
		}
		int hold = -prices[0];
		int cash1 = 0;
		int cash2 = 0;
		for (int i = 1; i < length; i++) {
			int newHold = Math.max(hold,cash2 - prices[i]);
			int newCash1 = hold + prices[i];
			int newCash2 = Math.max(cash1,cash2);
			hold = newHold;
			cash1 = newCash1;
			cash2 = newCash2;
		}
		return Math.max(cash1,cash2);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
