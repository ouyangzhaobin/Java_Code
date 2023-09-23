//给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。 
//
// 如果数组中不存在目标值 target，返回 [-1, -1]。 
//
// 你必须设计并实现时间复杂度为 O(log n) 的算法解决此问题。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [5,7,7,8,8,10], target = 8
//输出：[3,4] 
//
// 示例 2： 
//
// 
//输入：nums = [5,7,7,8,8,10], target = 6
//输出：[-1,-1] 
//
// 示例 3： 
//
// 
//输入：nums = [], target = 0
//输出：[-1,-1] 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 10⁵ 
// -10⁹ <= nums[i] <= 10⁹ 
// nums 是一个非递减数组 
// -10⁹ <= target <= 10⁹ 
// 
//
// Related Topics 数组 二分查找 👍 2475 👎 0


package leetcode.editor.cn;

/**
 * @id 34
 * @title 在排序数组中查找元素的第一个和最后一个位置
 * @author ouyang
 * @date 2023-09-23 13:29:46
 */

class P_34_FindFirstAndLastPositionOfElementInSortedArray{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_34_FindFirstAndLastPositionOfElementInSortedArray().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] searchRange(int[] nums, int target) {
		int leftIndex = binarySearch(nums,target,true);
		int rightIndex = binarySearch(nums,target,false) - 1;
		if (leftIndex <= rightIndex && rightIndex < nums.length && nums[leftIndex] == target && nums[rightIndex] == target) {
			return new int[]{leftIndex, rightIndex};
		}
		return new int[]{-1, -1};

    }
	public int binarySearch(int[] nums, int target, boolean lower) {
		int left = 0, right = nums.length - 1, ans = nums.length;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (nums[mid] > target || (lower && nums[mid] >= target)) {
				right = mid - 1;
				ans = mid;
			} else {
				left = mid + 1;
			}
		}
		return ans;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
