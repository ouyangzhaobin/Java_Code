//给你两个只包含 1 到 9 之间数字的数组 nums1 和 nums2 ，每个数组中的元素 互不相同 ，请你返回 最小 的数字，两个数组都 至少 包含这个数
//字的某个数位。
//
// 
//
// 示例 1： 
//
// 输入：nums1 = [4,1,3], nums2 = [5,7]
//输出：15
//解释：数字 15 的数位 1 在 nums1 中出现，数位 5 在 nums2 中出现。15 是我们能得到的最小数字。
// 
//
// 示例 2： 
//
// 输入：nums1 = [3,5,2,6], nums2 = [3,1,7]
//输出：3
//解释：数字 3 的数位 3 在两个数组中都出现了。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums1.length, nums2.length <= 9 
// 1 <= nums1[i], nums2[i] <= 9 
// 每个数组中，元素 互不相同 。 
// 
//
// Related Topics 数组 哈希表 枚举 👍 11 👎 0


package leetcode.editor.cn;

import java.util.HashSet;
import java.util.Set;

/**
 * @id 2605
 * @title 从两个数字数组里生成最小数字
 * @author ouyang
 * @date 2023-09-05 00:02:24
 */

class P_2605_FormSmallestNumberFromTwoDigitArrays{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_2605_FormSmallestNumberFromTwoDigitArrays().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<>();
		int minNums1 = Integer.MAX_VALUE;
		int minNums2 = Integer.MAX_VALUE;
		int minNum = Integer.MAX_VALUE;
		for (int num : nums1) {
			set.add(num);
			minNums1 = Math.min(num,minNums1);
		}
		for (int num : nums2) {
			if(set.contains(num)){
				minNum = Math.min(minNum,num);
			}else{
				minNums2 = Math.min(num,minNums2);
			}
		}
		if(minNum < 10){
			return minNum;
		}else if(Math.min(minNums1,minNums2) == 0){
			return Math.max(minNums1,minNums2) * 10 + Math.min(minNums1,minNums2);
		}else {
			return Math.min(minNums1,minNums2) * 10 + Math.max(minNums1,minNums2);
		}

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
