//给定一个含有 n 个正整数的数组和一个正整数 target 。 
//
// 找出该数组中满足其总和大于等于 target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返
//回其长度。如果不存在符合条件的子数组，返回 0 。 
//
// 
//
// 示例 1： 
//
// 
//输入：target = 7, nums = [2,3,1,2,4,3]
//输出：2
//解释：子数组 [4,3] 是该条件下的长度最小的子数组。
// 
//
// 示例 2： 
//
// 
//输入：target = 4, nums = [1,4,4]
//输出：1
// 
//
// 示例 3： 
//
// 
//输入：target = 11, nums = [1,1,1,1,1,1,1,1]
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 1 <= target <= 10⁹ 
// 1 <= nums.length <= 10⁵ 
// 1 <= nums[i] <= 10⁵ 
// 
//
// 
//
// 进阶： 
//
// 
// 如果你已经实现 O(n) 时间复杂度的解法, 请尝试设计一个 O(n log(n)) 时间复杂度的解法。 
// 
//
// Related Topics 数组 二分查找 前缀和 滑动窗口 👍 1884 👎 0


package leetcode.editor.cn;

/**
 * @id 209
 * @title 长度最小的子数组
 * @author ouyang
 * @date 2023-09-18 00:34:29
 */

class P_209_MinimumSizeSubarraySum{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_209_MinimumSizeSubarraySum().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
		int length = nums.length;
		if(length == 0){
			return 0;
		}
		int start = 0;
		int end = 0;
		int ans = Integer.MAX_VALUE;
		int sum = 0;
		while(end < length){
			sum += nums[end];
			while(sum >= target){
				ans = Math.min(ans,end - start + 1);
				sum -= nums[start];
				start++;
			}
			end++;
		}
		return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
