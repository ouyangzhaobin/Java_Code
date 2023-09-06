//给你两个整数 left 和 right ，表示区间 [left, right] ，返回此区间内所有数字 按位与 的结果（包含 left 、right 端点）
//。 
//
// 
//
// 示例 1： 
//
// 
//输入：left = 5, right = 7
//输出：4
// 
//
// 示例 2： 
//
// 
//输入：left = 0, right = 0
//输出：0
// 
//
// 示例 3： 
//
// 
//输入：left = 1, right = 2147483647
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 0 <= left <= right <= 2³¹ - 1 
// 
//
// Related Topics 位运算 👍 470 👎 0


package leetcode.editor.cn;

/**
 * @id 201
 * @title 数字范围按位与
 * @author ouyang
 * @date 2023-09-06 19:14:53
 */

class P_201_BitwiseAndOfNumbersRange{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_201_BitwiseAndOfNumbersRange().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
		int ans = 0;
		// 找到公共前缀
		while(left < right){
			left >>= 1;
			right >>= 1;
			ans++;
		}
		return left << ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
