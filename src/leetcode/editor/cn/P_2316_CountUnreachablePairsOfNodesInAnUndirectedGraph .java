//给你一个整数 n ，表示一张 无向图 中有 n 个节点，编号为 0 到 n - 1 。同时给你一个二维整数数组 edges ，其中 edges[i] = [
//ai, bi] 表示节点 ai 和 bi 之间有一条 无向 边。 
//
// 请你返回 无法互相到达 的不同 点对数目 。 
//
// 
//
// 示例 1： 
//
// 
//
// 输入：n = 3, edges = [[0,1],[0,2],[1,2]]
//输出：0
//解释：所有点都能互相到达，意味着没有点对无法互相到达，所以我们返回 0 。
// 
//
// 示例 2： 
//
// 
//
// 输入：n = 7, edges = [[0,2],[0,5],[2,4],[1,6],[5,4]]
//输出：14
//解释：总共有 14 个点对互相无法到达：
//[[0,1],[0,3],[0,6],[1,2],[1,3],[1,4],[1,5],[2,3],[2,6],[3,4],[3,5],[3,6],[4,6]
//,[5,6]]
//所以我们返回 14 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 10⁵ 
// 0 <= edges.length <= 2 * 10⁵ 
// edges[i].length == 2 
// 0 <= ai, bi < n 
// ai != bi 
// 不会有重复边。 
// 
//
// Related Topics 深度优先搜索 广度优先搜索 并查集 图 👍 26 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @id 2316
 * @title 统计无向图中无法互相到达点对数
 * @author ouyang
 * @date 2023-10-21 00:20:40
 */

class P_2316_CountUnreachablePairsOfNodesInAnUndirectedGraph{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_2316_CountUnreachablePairsOfNodesInAnUndirectedGraph().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public long countPairs(int n, int[][] edges) {
		List<Integer>[] g = new ArrayList[n];
		Arrays.setAll(g,e->new ArrayList<>());
		for (int[] edge : edges) {
			int x = edge[0],y = edge[1];
			g[x].add(y);
			g[y].add(x);
		}
		boolean[] vis = new boolean[n];
		long ans = 0;
		for (int i = 0, total = 0; i < n; i++) {
			if (!vis[i]) { // 未访问的点：说明找到了一个新的连通块
				int size = dfs(i, g, vis);
				ans += (long) size * total;
				total += size;
			}
		}
		return ans;
    }
	private int dfs(int x, List<Integer>[] g, boolean[] vis) {
		vis[x] = true; // 避免重复访问同一个点
		int size = 1;
		for (int y : g[x]) {
			if (!vis[y]) {
				size += dfs(y, g, vis);
			}
		}
		return size;
	}

}
//leetcode submit region end(Prohibit modification and deletion)

}
