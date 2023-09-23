//给你一个满足下述两条属性的 m x n 整数矩阵： 
//
// 
// 每行中的整数从左到右按非递减顺序排列。 
// 每行的第一个整数大于前一行的最后一个整数。 
// 
//
// 给你一个整数 target ，如果 target 在矩阵中，返回 true ；否则，返回 false 。 
//
// 
//
// 示例 1： 
// 
// 
//输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
//输出：true
// 
//
// 示例 2： 
// 
// 
//输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// m == matrix.length 
// n == matrix[i].length 
// 1 <= m, n <= 100 
// -10⁴ <= matrix[i][j], target <= 10⁴ 
// 
//
// Related Topics 数组 二分查找 矩阵 👍 848 👎 0


package leetcode.editor.cn;

/**
 * @id 74
 * @title 搜索二维矩阵
 * @author ouyang
 * @date 2023-09-23 12:48:12
 */

class P_74_SearchA2dMatrix{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_74_SearchA2dMatrix().new Solution();
		  int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		  // int[][] matrix = {{1}};
		 System.out.println(solution.searchMatrix(matrix, 3));
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	public boolean searchMatrix(int[][] matrix, int target) {
		int rowIndex = binarySearchFirstColumn(matrix, target);
		if (rowIndex < 0) {
			return false;
		}
		return binarySearchRow(matrix[rowIndex], target);
	}

	public int binarySearchFirstColumn(int[][] matrix, int target) {
		int low = -1, high = matrix.length - 1;
		while (low < high) {
			int mid = (high - low + 1) / 2 + low;
			if (matrix[mid][0] <= target) {
				low = mid;
			} else {
				high = mid - 1;
			}
		}
		return low;
	}

	public boolean binarySearchRow(int[] row, int target) {
		int low = 0, high = row.length - 1;
		while (low <= high) {
			int mid = (high - low) / 2 + low;
			if (row[mid] == target) {
				return true;
			} else if (row[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return false;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
