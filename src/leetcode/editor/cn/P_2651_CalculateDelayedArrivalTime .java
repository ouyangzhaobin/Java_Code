//给你一个正整数 arrivalTime 表示列车正点到站的时间（单位：小时），另给你一个正整数 delayedTime 表示列车延误的小时数。 
//
// 返回列车实际到站的时间。 
//
// 注意，该问题中的时间采用 24 小时制。 
//
// 
//
// 示例 1： 
//
// 输入：arrivalTime = 15, delayedTime = 5 
//输出：20 
//解释：列车正点到站时间是 15:00 ，延误 5 小时，所以列车实际到站的时间是 15 + 5 = 20（20:00）。
// 
//
// 示例 2： 
//
// 输入：arrivalTime = 13, delayedTime = 11
//输出：0
//解释：列车正点到站时间是 13:00 ，延误 11 小时，所以列车实际到站的时间是 13 + 11 = 24（在 24 小时制中表示为 00:00 ，所以返
//回 0）。 
//
// 
//
// 提示： 
//
// 
// 1 <= arrivaltime < 24 
// 1 <= delayedTime <= 24 
// 
//
// Related Topics 数学 👍 14 👎 0


package leetcode.editor.cn;

/**
 * @id 2651
 * @title 计算列车到站时间
 * @author ouyang
 * @date 2023-09-08 00:24:16
 */

class P_2651_CalculateDelayedArrivalTime{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_2651_CalculateDelayedArrivalTime().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
		return (arrivalTime + delayedTime) % 24;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
