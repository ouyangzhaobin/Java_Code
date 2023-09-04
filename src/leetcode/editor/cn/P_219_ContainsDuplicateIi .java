//给你一个整数数组 nums 和一个整数 k ，判断数组中是否存在两个 不同的索引 i 和 j ，满足 nums[i] == nums[j] 且 abs(i 
//- j) <= k 。如果存在，返回 true ；否则，返回 false 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,3,1], k = 3
//输出：true 
//
// 示例 2： 
//
// 
//输入：nums = [1,0,1,1], k = 1
//输出：true 
//
// 示例 3： 
//
// 
//输入：nums = [1,2,3,1,2,3], k = 2
//输出：false 
//
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁵ 
// -10⁹ <= nums[i] <= 10⁹ 
// 0 <= k <= 10⁵ 
// 
//
// Related Topics 数组 哈希表 滑动窗口 👍 629 👎 0


package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * @id 219
 * @title 存在重复元素 II
 * @author ouyang
 * @date 2023-09-04 10:41:28
 */

class P_219_ContainsDuplicateIi{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_219_ContainsDuplicateIi().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
		int len = nums.length;
		Map<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < len; i++) {
			if(map.containsKey(nums[i])){
				if(Math.abs(map.get(nums[i]) - i) <= k){
					return true;
				}
			}
			map.put(nums[i],i);
		}
		return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
