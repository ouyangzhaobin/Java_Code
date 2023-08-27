//给你一个非负整数数组 nums ，你最初位于数组的 第一个下标 。数组中的每个元素代表你在该位置可以跳跃的最大长度。 
//
// 判断你是否能够到达最后一个下标，如果可以，返回 true ；否则，返回 false 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [2,3,1,1,4]
//输出：true
//解释：可以先跳 1 步，从下标 0 到达下标 1, 然后再从下标 1 跳 3 步到达最后一个下标。
// 
//
// 示例 2： 
//
// 
//输入：nums = [3,2,1,0,4]
//输出：false
//解释：无论怎样，总会到达下标为 3 的位置。但该下标的最大跳跃长度是 0 ， 所以永远不可能到达最后一个下标。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁴ 
// 0 <= nums[i] <= 10⁵ 
// 
//
// Related Topics 贪心 数组 动态规划 👍 2455 👎 0


package leetcode.editor.cn;

/**
 * @id 55
 * @title 跳跃游戏
 * @author ouyang
 * @date 2023-08-27 11:31:07
 */

class P_55_JumpGame{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_55_JumpGame().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canJump(int[] nums) {
		// 动态规划
		int len = nums.length;
		int[] dp = new int[len];
		dp[0] = nums[0];
		if (len == 1){
			return true;
		}
		for (int i = 1; i < len; i++) {
			if(dp[i-1] >= i){
				dp[i] = Math.max(dp[i-1],i+nums[i]);
				if(dp[i] >= len-1){
					return true;
				}
			}else{
				return false;
			}
		}
		return false;
		/*
		int n = nums.length;
        int rightmost = 0;
        for (int i = 0; i < n; ++i) {
            if (i <= rightmost) {
                rightmost = Math.max(rightmost, i + nums[i]);
                if (rightmost >= n - 1) {
                    return true;
                }
            }
        }
        return false;
		 */
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
