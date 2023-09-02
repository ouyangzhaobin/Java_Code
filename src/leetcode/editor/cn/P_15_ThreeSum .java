//给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != 
//k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请 
//
// 你返回所有和为 0 且不重复的三元组。 
//
// 注意：答案中不可以包含重复的三元组。 
//
// 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [-1,0,1,2,-1,-4]
//输出：[[-1,-1,2],[-1,0,1]]
//解释：
//nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0 。
//nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0 。
//nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0 。
//不同的三元组是 [-1,0,1] 和 [-1,-1,2] 。
//注意，输出的顺序和三元组的顺序并不重要。
// 
//
// 示例 2： 
//
// 
//输入：nums = [0,1,1]
//输出：[]
//解释：唯一可能的三元组和不为 0 。
// 
//
// 示例 3： 
//
// 
//输入：nums = [0,0,0]
//输出：[[0,0,0]]
//解释：唯一可能的三元组和为 0 。
// 
//
// 
//
// 提示： 
//
// 
// 3 <= nums.length <= 3000 
// -10⁵ <= nums[i] <= 10⁵ 
// 
//
// Related Topics 数组 双指针 排序 👍 6310 👎 0


package leetcode.editor.cn;

import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @id 15
 * @title 三数之和
 * @author ouyang
 * @date 2023-09-02 12:00:41
 */

class P_15_ThreeSum{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_15_ThreeSum().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
		int len = nums.length;
		if(nums == null || len < 3){
			return ans;
		}
		Arrays.sort(nums);
		for (int i = 0; i < len; i++) {
			if(nums[i] > 0){
				break;
			}
			if(i > 0 && nums[i] == nums[i-1]){
				continue;
			}
			int left = i + 1;
			int right = len - 1;
			while(left < right){
				int sum = nums[i] + nums[left] + nums[right];
				if(sum == 0){
					ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
					while (left < right && nums[left] == nums[left+1]){
						left++;
					}
					while (left < right && nums[right] == nums[right-1]){
						right--;
					}
					left++;
					right--;
				}else if(sum < 0){
					left++;
				}else if(sum > 0){
					right--;
				}
			}
		}

		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
