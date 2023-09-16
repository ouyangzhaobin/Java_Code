//给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。 
//
// 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。 
//
// 此外，你可以假设该网格的四条边均被水包围。 
//
// 
//
// 示例 1： 
//
// 
//输入：grid = [
//  ["1","1","1","1","0"],
//  ["1","1","0","1","0"],
//  ["1","1","0","0","0"],
//  ["0","0","0","0","0"]
//]
//输出：1
// 
//
// 示例 2： 
//
// 
//输入：grid = [
//  ["1","1","0","0","0"],
//  ["1","1","0","0","0"],
//  ["0","0","1","0","0"],
//  ["0","0","0","1","1"]
//]
//输出：3
// 
//
// 
//
// 提示： 
//
// 
// m == grid.length 
// n == grid[i].length 
// 1 <= m, n <= 300 
// grid[i][j] 的值为 '0' 或 '1' 
// 
//
// Related Topics 深度优先搜索 广度优先搜索 并查集 数组 矩阵 👍 2296 👎 0


package leetcode.editor.cn;

import java.awt.geom.Area;

/**
 * @id 200
 * @title 岛屿数量
 * @author ouyang
 * @date 2023-09-15 20:51:07
 */

class P_200_NumberOfIslands{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_200_NumberOfIslands().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	int res = 0;
    public int numIslands(char[][] grid) {
		for (int r = 0; r < grid.length; r++) {
			for (int c = 0; c < grid[r].length; c++) {
				if (grid[r][c] == '1') {
					dfs(grid,r,c);
					res++;
				}
			}
		}
		return res;
    }
	public void dfs(char[][] grid,int r,int c){
		if (!(0 <= r && r < grid.length && 0 <= c && c < grid[0].length)) {
			return;
		}
		if (grid[r][c] != '1') {
			return;
		}
		grid[r][c] = '2';
		dfs(grid,r-1,c);
		dfs(grid,r+1,c);
		dfs(grid,r,c-1);
		dfs(grid,r,c+1);

	}

}
//leetcode submit region end(Prohibit modification and deletion)

}
