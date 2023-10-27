//给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
//输出：6
//解释：上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。 
// 
//
// 示例 2： 
//
// 
//输入：height = [4,2,0,3,2,5]
//输出：9
// 
//
// 
//
// 提示： 
//
// 
// n == height.length 
// 1 <= n <= 2 * 10⁴ 
// 0 <= height[i] <= 10⁵ 
// 
//
// Related Topics 栈 数组 双指针 动态规划 单调栈 👍 4786 👎 0


package leetcode.editor.cn;

/**
 * @id 42
 * @title 接雨水
 * @author ouyang
 * @date 2023-10-17 09:19:06
 */

class P_42_TrappingRainWater{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_42_TrappingRainWater().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int trap(int[] height) {
		// 双指针
		/**
		int length = height.length;
		int sum = 0;
		int max_left = 0;
		int[] max_right = new int[length];
		for (int i = length - 2; i >= 0; i--){
			max_right[i] = Math.max(max_right[i + 1],height[i + 1]);
		}
		for (int i = 1; i < length - 1; i++) {
			max_left = Math.max(max_left,height[i-1]);
			int min = Math.min(max_left,max_right[i]);
			if (min > height[i]) {
				sum += (min - height[i]);
			}
		}
		return sum;
		 */
		int sum = 0;
		int max_left = 0;
		int max_right = 0;
		int left = 1;
		int right = height.length - 2; // 加右指针进去
		for (int i = 1; i < height.length - 1; i++) {
			//从左到右更
			if (height[left - 1] < height[right + 1]) {
				max_left = Math.max(max_left, height[left - 1]);
				int min = max_left;
				if (min > height[left]) {
					sum = sum + (min - height[left]);
				}
				left++;
				//从右到左更
			} else {
				max_right = Math.max(max_right, height[right + 1]);
				int min = max_right;
				if (min > height[right]) {
					sum = sum + (min - height[right]);
				}
				right--;
			}
		}
		return sum;


		/**
		// 动态规划
		int length = height.length;
		int sum = 0;
		int[] max_left = new int[length];
		int[] max_right = new int[length];

		for (int i = 1; i < length - 1; i++) {
			max_left[i] = Math.max(max_left[i - 1],height[i-1]);
		}
		for (int i = length - 2; i >= 0; i--){
			max_right[i] = Math.max(max_right[i + 1],height[i + 1]);
		}
		for (int i = 1; i < length - 1; i++) {
			int min = Math.min(max_left[i], max_right[i]);
			if (min > height[i]) {
				sum = sum + (min - height[i]);
			}
		}
		return sum;
		 */

		/**
		// 按列
		int length = height.length;
		int sum = 0;

		for (int i = 1; i < length - 1; i++) {
			int max_left = 0;
			for (int j = i - 1; j >= 0; j--){
				if (max_left < height[j]) {
					max_left = height[j];
				}
			}
			int max_right = 0;
			for (int j = i + 1; j < length; j++) {
				if (max_right < height[j]) {
					max_right = height[j];
				}
			}
			int temp = Math.min(max_left,max_right) - height[i];
			sum += (temp >= 0 ? temp : 0);
		}
		return sum;
		 */
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
