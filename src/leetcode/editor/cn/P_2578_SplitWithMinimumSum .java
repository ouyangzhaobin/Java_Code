//给你一个正整数 num ，请你将它分割成两个非负整数 num1 和 num2 ，满足： 
//
// 
// num1 和 num2 直接连起来，得到 num 各数位的一个排列。 
// 
//
// 
// 换句话说，num1 和 num2 中所有数字出现的次数之和等于 num 中所有数字出现的次数。 
// 
// 
// num1 和 num2 可以包含前导 0 。 
//
//
// 请你返回 num1 和 num2 可以得到的和的 最小 值。 
//
// 注意： 
//
// 
// num 保证没有前导 0 。 
// num1 和 num2 中数位顺序可以与 num 中数位顺序不同。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：num = 4325
//输出：59
//解释：我们可以将 4325 分割成 num1 = 24 和 num2 = 35 ，和为 59 ，59 是最小和。
// 
//
// 示例 2： 
//
// 
//输入：num = 687
//输出：75
//解释：我们可以将 687 分割成 num1 = 68 和 num2 = 7 ，和为最优值 75 。
// 
//
// 
//
// 提示： 
//
// 
// 10 <= num <= 10⁹ 
// 
//
// Related Topics 贪心 数学 排序 👍 42 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @id 2578
 * @title 最小和分割
 * @author ouyang
 * @date 2023-10-09 13:50:19
 */

class P_2578_SplitWithMinimumSum{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_2578_SplitWithMinimumSum().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int splitNum(int num) {
		ArrayList<Integer> ans = new ArrayList<>();
		while(num!=0){
			ans.add(num%10);
			num /= 10;
		}
		Collections.sort(ans);
		int num1 = 0, num2 = 0;
		for (int i = 0; i < ans.size(); i++) {
			if (i % 2 == 0) {
				num1 = num1 * 10 + ans.get(i);
			}else {
				num2 = num2 * 10 + ans.get(i);
			}
		}
		return num1 + num2;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
