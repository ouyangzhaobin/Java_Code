package leetcode.editor.cn;

/**
 * 题目Id：1267;
 * 题目：统计参与通信的服务器，count-servers-that-communicate;
 * 日期：2023-08-24 13:52:28
 */

//这里有一幅服务器分布图，服务器的位置标识在 m * n 的整数矩阵网格 grid 中，1 表示单元格上有服务器，0 表示没有。
//
// 如果两台服务器位于同一行或者同一列，我们就认为它们之间可以进行通信。
//
// 请你统计并返回能够与至少一台其他服务器进行通信的服务器的数量。
//
//
//
// 示例 1：
//
//
//
// 输入：grid = [[1,0],[0,1]]
//输出：0
//解释：没有一台服务器能与其他服务器进行通信。
//
// 示例 2：
//
//
//
// 输入：grid = [[1,0],[1,1]]
//输出：3
//解释：所有这些服务器都至少可以与一台别的服务器进行通信。
//
//
// 示例 3：
//
//
//
// 输入：grid = [[1,1,0,0],[0,0,1,0],[0,0,1,0],[0,0,0,1]]
//输出：4
//解释：第一行的两台服务器互相通信，第三列的两台服务器互相通信，但右下角的服务器无法与其他服务器通信。
//
//
//
//
// 提示：
//
//
// m == grid.length
// n == grid[i].length
// 1 <= m <= 250
// 1 <= n <= 250
// grid[i][j] == 0 or 1
//
//
// Related Topics 深度优先搜索 广度优先搜索 并查集 数组 计数 矩阵 👍 81 👎 0


class P_1267_CountServersThatCommunicate{
	public static void main(String[] args) {
		Solution solution = new P_1267_CountServersThatCommunicate().new Solution();

	}

	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution {
		public int countServers(int[][] grid) {
			// 时间复杂度为o（mn)
			int m = grid.length, n = grid[0].length;
			int[] rowCount = new int[m];
			int[] colCount = new int[n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (grid[i][j] == 1) {
						rowCount[i]++;
						colCount[j]++;
					}
				}
			}
			int ans = 0;
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (grid[i][j] == 1) {
						if (rowCount[i] > 1 || colCount[j] > 1) {
							ans++;
						}
					}
				}
			}
			return ans;
        /*
        // 时间复杂度为O（mxmxn)
        int count = 0;
        if (grid == null){
            return count;
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && isConnectedServer(i, j, grid)){
                        count++;
                    }
                }
            }
        return count;
         */
		}

		public boolean isConnectedServer(int i, int j, int[][] grid) {
			int sum = 0;
			for (int col = 0; col < grid[0].length; col++) {
				sum+=grid[i][col];
			}
			for (int row = 0; row < grid.length; row++) {
				sum+=grid[row][j];
			}
			return sum>2;
		}
	}
//leetcode submit region end(Prohibit modification and deletion)

}
