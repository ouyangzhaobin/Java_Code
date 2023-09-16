//给你一个 m x n 的矩阵 board ，由若干字符 'X' 和 'O' ，找到所有被 'X' 围绕的区域，并将这些区域里所有的 'O' 用 'X' 填充
//。
//
// 
// 
// 
// 
// 
//
// 示例 1： 
// 
// 
//输入：board = [["X","X","X","X"],["X","O","O","X"],["X","X","O","X"],["X","O",
//"X","X"]]
//输出：[["X","X","X","X"],["X","X","X","X"],["X","X","X","X"],["X","O","X","X"]]
//解释：被围绕的区间不会存在于边界上，换句话说，任何边界上的 'O' 都不会被填充为 'X'。 任何不在边界上，或不与边界上的 'O' 相连的 'O' 最终都
//会被填充为 'X'。如果两个元素在水平或垂直方向相邻，则称它们是“相连”的。
// 
//
// 示例 2： 
//
// 
//输入：board = [["X"]]
//输出：[["X"]]
// 
//
// 
//
// 提示： 
//
// 
// m == board.length 
// n == board[i].length 
// 1 <= m, n <= 200 
// board[i][j] 为 'X' 或 'O' 
// 
//
// Related Topics 深度优先搜索 广度优先搜索 并查集 数组 矩阵 👍 1015 👎 0


package leetcode.editor.cn;

/**
 * @id 130
 * @title 被围绕的区域
 * @author ouyang
 * @date 2023-09-15 21:03:44
 */

class P_130_SurroundedRegions{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_130_SurroundedRegions().new Solution();
		 char[][] board = {
				 {'X', 'X', 'X', 'X'},
				 {'X', 'O', 'O', 'X'},
				 {'X', 'X', 'O', 'X'},
				 {'X', 'O', 'X', 'X'}
		 };
		 solution.solve(board);
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void solve(char[][] board) {
		if (board.length==0) {
			return;
		}
		for (int r = 0; r < board.length; r++) {
			dfs(board,r,0);
			dfs(board,r,board[0].length-1);
		}
		for (int c = 1; c < board[0].length-1; c++) {
			dfs(board,0,c);
			dfs(board,board.length-1,c);
		}
		for (int r = 0; r < board.length; r++) {
			for (int c = 0; c < board[0].length; c++) {
				if (board[r][c]=='A') {
					board[r][c]='O';
				}else if(board[r][c] == 'O'){
					board[r][c]='X';
				}
			}
		}

    }
	public void dfs(char[][] board,int r,int c){
		if (r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c] != 'O') {
			return ;
		}
		board[r][c] = 'A';
		dfs(board, r + 1, c);
		dfs(board, r - 1, c);
		dfs(board, r, c + 1);
		dfs(board, r, c - 1);
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
