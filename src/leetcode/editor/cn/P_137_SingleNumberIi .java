//给你一个整数数组 nums ，除某个元素仅出现 一次 外，其余每个元素都恰出现 三次 。请你找出并返回那个只出现了一次的元素。 
//
// 你必须设计并实现线性时间复杂度的算法且使用常数级空间来解决此问题。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [2,2,3,2]
//输出：3
// 
//
// 示例 2： 
//
// 
//输入：nums = [0,1,0,1,0,1,99]
//输出：99
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 3 * 10⁴ 
// -2³¹ <= nums[i] <= 2³¹ - 1 
// nums 中，除某个元素仅出现 一次 外，其余每个元素都恰出现 三次 
// 
//
// Related Topics 位运算 数组 👍 1058 👎 0


package leetcode.editor.cn;

/**
 * @id 137
 * @title 只出现一次的数字 II
 * @author ouyang
 * @date 2023-09-06 19:05:55
 */

class P_137_SingleNumberIi{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_137_SingleNumberIi().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int singleNumber(int[] nums) {
		int ans = 0;
		for (int i = 0; i < 32; i++) {
			int total = 0;
			for (int num : nums) {
				total += ((num >> i) & 1);
			}
			if(total % 3 != 0){
				ans |= (1 << i);
			}
		}
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
