//给你一个整数数组 prices 和一个整数 k ，其中 prices[i] 是某支给定的股票在第 i 天的价格。 
//
// 设计一个算法来计算你所能获取的最大利润。你最多可以完成 k 笔交易。也就是说，你最多可以买 k 次，卖 k 次。 
//
// 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。 
//
// 
//
// 示例 1： 
//
// 
//输入：k = 2, prices = [2,4,1]
//输出：2
//解释：在第 1 天 (股票价格 = 2) 的时候买入，在第 2 天 (股票价格 = 4) 的时候卖出，这笔交易所能获得利润 = 4-2 = 2 。 
//
// 示例 2： 
//
// 
//输入：k = 2, prices = [3,2,6,5,0,3]
//输出：7
//解释：在第 2 天 (股票价格 = 2) 的时候买入，在第 3 天 (股票价格 = 6) 的时候卖出, 这笔交易所能获得利润 = 6-2 = 4 。
//     随后，在第 5 天 (股票价格 = 0) 的时候买入，在第 6 天 (股票价格 = 3) 的时候卖出, 这笔交易所能获得利润 = 3-0 = 3 
//。 
//
// 
//
// 提示： 
//
// 
// 1 <= k <= 100 
// 1 <= prices.length <= 1000 
// 0 <= prices[i] <= 1000 
// 
//
// Related Topics 数组 动态规划 👍 1050 👎 0


package leetcode.editor.cn;

import java.util.Arrays;

/**
 * @id 188
 * @title 买卖股票的最佳时机 IV
 * @author ouyang
 * @date 2023-10-04 11:02:19
 */

class P_188_BestTimeToBuyAndSellStockIv{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_188_BestTimeToBuyAndSellStockIv().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfit(int k, int[] prices) {
		int length = prices.length;
		if (length==0) {
			return 0;
		}
		k = Math.min(k, length / 2);
		int[][] buy = new int[length][k + 1];
		int[][] sell = new int[length][k + 1];
		buy[0][0] = -prices[0];
		sell[0][0] = 0;
		for (int i = 1; i <= k; i++) {
			buy[0][i] = sell[0][i] = Integer.MIN_VALUE / 2;
		}

		for (int i = 1; i < length; i++) {
			buy[i][0] = Math.max(buy[i-1][0],sell[i-1][0]-prices[i]);
			for (int j = 1; j <= k; j++) {
				buy[i][j] = Math.max(buy[i-1][j],sell[i-1][j] - prices[i]);
				sell[i][j] = Math.max(sell[i-1][j],buy[i-1][j-1] + prices[i]);
			}
		}
		return Arrays.stream(sell[length-1]).max().getAsInt();
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}
