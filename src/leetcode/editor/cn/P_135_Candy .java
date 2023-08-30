//n 个孩子站成一排。给你一个整数数组 ratings 表示每个孩子的评分。 
//
// 你需要按照以下要求，给这些孩子分发糖果： 
//
// 
// 每个孩子至少分配到 1 个糖果。 
// 相邻两个孩子评分更高的孩子会获得更多的糖果。 
// 
//
// 请你给每个孩子分发糖果，计算并返回需要准备的 最少糖果数目 。 
//
// 
//
// 示例 1： 
//
// 
//输入：ratings = [1,0,2]
//输出：5
//解释：你可以分别给第一个、第二个、第三个孩子分发 2、1、2 颗糖果。
// 
//
// 示例 2： 
//
// 
//输入：ratings = [1,2,2]
//输出：4
//解释：你可以分别给第一个、第二个、第三个孩子分发 1、2、1 颗糖果。
//     第三个孩子只得到 1 颗糖果，这满足题面中的两个条件。 
//
// 
//
// 提示： 
//
// 
// n == ratings.length 
// 1 <= n <= 2 * 10⁴ 
// 0 <= ratings[i] <= 2 * 10⁴ 
// 
//
// Related Topics 贪心 数组 👍 1299 👎 0


package leetcode.editor.cn;

/**
 * @id 135
 * @title 分发糖果
 * @author ouyang
 * @date 2023-08-30 11:04:45
 */

class P_135_Candy{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_135_Candy().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int candy(int[] ratings) {
		int len = ratings.length;
		int[] left = new int[len];
		for (int i = 0; i < len; i++) {
			if(i > 0 && ratings[i] > ratings[i-1]){
				left[i] = left[i-1] + 1;
			}else {
				left[i] = 1;
			}
		}
		int right = 0,sum = 0;
		for (int i = len-1; i >= 0; i--) {
			if(i < len - 1 && ratings[i] > ratings[i+1]){
				right ++;
			}else{
				right = 1;
			}
			sum += Math.max(left[i],right);
		}
		return sum;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
