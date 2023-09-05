//给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。 
//
// 
//
// 示例 1： 
// 
// 
//输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
//输出：[1,2,3,6,9,8,7,4,5]
// 
//
// 示例 2： 
// 
// 
//输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
//输出：[1,2,3,4,8,12,11,10,9,5,6,7]
// 
//
// 
//
// 提示： 
//
// 
// m == matrix.length 
// n == matrix[i].length 
// 1 <= m, n <= 10 
// -100 <= matrix[i][j] <= 100 
// 
//
// Related Topics 数组 矩阵 模拟 👍 1477 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * @id 54
 * @title 螺旋矩阵
 * @author ouyang
 * @date 2023-09-05 10:38:59
 */

class P_54_SpiralMatrix{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_54_SpiralMatrix().new Solution();
		  int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		 System.out.println(solution.spiralOrder(matrix));
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
		int u = 0;
		int d = matrix.length - 1;
		int l = 0;
		int r = matrix[0].length - 1;
		List<Integer> list = new ArrayList<>();
		if(matrix.length == 0){
			return new ArrayList<>();
		}
		while (true){
			for (int i = l; i <= r; i++) {
				list.add(matrix[u][i]);
			}
			if (++u > d){
				break;
			}
			for (int i = u; i <= d; i++) {
				list.add(matrix[i][r]);
			}
			if (--r < l){
				break;
			}
			for (int i = r; i >= l; i--) {
				list.add(matrix[d][i]);
			}
			if (--d < u){
				break;
			}
			for (int i = d; i >= u; i--) {
				list.add(matrix[i][l]);
			}
			if (++l > r){
				break;
			}
		}
		return list;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
