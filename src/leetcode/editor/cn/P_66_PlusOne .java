//给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。 
//
// 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。 
//
// 你可以假设除了整数 0 之外，这个整数不会以零开头。 
//
// 
//
// 示例 1： 
//
// 
//输入：digits = [1,2,3]
//输出：[1,2,4]
//解释：输入数组表示数字 123。
// 
//
// 示例 2： 
//
// 
//输入：digits = [4,3,2,1]
//输出：[4,3,2,2]
//解释：输入数组表示数字 4321。
// 
//
// 示例 3： 
//
// 
//输入：digits = [0]
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= digits.length <= 100 
// 0 <= digits[i] <= 9 
// 
//
// Related Topics 数组 数学 👍 1289 👎 0


package leetcode.editor.cn;

/**
 * @id 66
 * @title 加一
 * @author ouyang
 * @date 2023-09-07 10:52:04
 */

class P_66_PlusOne{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_66_PlusOne().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] plusOne(int[] digits) {
		int len = digits.length;
		int[] ans = new int[len+1];
		int flag = 0;
		if(digits[len - 1] == 9){
			flag = 1;
			digits[len - 1] = 0;
			for (int i = len - 2; i >= 0; i--) {
				if(digits[i] + flag != 10){
					digits[i]++;
					return digits;
				}else{
					digits[i] = 0;
				}
			}
			ans[0] = 1;
			return ans;
		}else {
			digits[len - 1] ++;
			return digits;
		}
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
