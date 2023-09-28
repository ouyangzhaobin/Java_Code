//假设有一个很长的花坛，一部分地块种植了花，另一部分却没有。可是，花不能种植在相邻的地块上，它们会争夺水源，两者都会死去。 
//
// 给你一个整数数组 flowerbed 表示花坛，由若干 0 和 1 组成，其中 0 表示没种植花，1 表示种植了花。另有一个数 n ，能否在不打破种植规则
//的情况下种入 n 朵花？能则返回 true ，不能则返回 false 。 
//
// 
//
// 示例 1： 
//
// 
//输入：flowerbed = [1,0,0,0,1], n = 1
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：flowerbed = [1,0,0,0,1], n = 2
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 1 <= flowerbed.length <= 2 * 10⁴ 
// flowerbed[i] 为 0 或 1 
// flowerbed 中不存在相邻的两朵花 
// 0 <= n <= flowerbed.length 
// 
//
// Related Topics 贪心 数组 👍 637 👎 0


package leetcode.editor.cn;

/**
 * @id 605
 * @title 种花问题
 * @author ouyang
 * @date 2023-09-29 00:30:53
 */

class P_605_CanPlaceFlowers{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_605_CanPlaceFlowers().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
		int length = flowerbed.length;
		int[] flowerbedNew = new int[length + 2];
		flowerbedNew[0] = 0;
		flowerbedNew[length + 1] = 0;
		for (int i = 0; i < flowerbed.length; i++) {
			flowerbedNew[i + 1] = flowerbed[i];
		}
		int ans = 0;
		int count = 0;
		for (int flower : flowerbedNew) {
			if (flower == 0) {
				count ++;
			}else{
				ans += (count > 0 ? ((count - 1) / 2) : 0 );
				count = 0;
			}
		}
		ans += (count > 0 ? ((count - 1) / 2) : 0 );
		return ans >= n ? true : false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
// 1 0 0 0 0 0 1
