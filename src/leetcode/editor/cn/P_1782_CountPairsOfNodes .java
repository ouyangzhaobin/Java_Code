package leetcode.editor.cn;

import java.util.*;

/**
  * 题目Id：1782; 
  * 题目：统计点对的数目，count-pairs-of-nodes; 
  * 日期：2023-08-23 11:00:44
*/

//给你一个无向图，无向图由整数 n ，表示图中节点的数目，和 edges 组成，其中 edges[i] = [ui, vi] 表示 ui 和 vi 之间有一条
//无向边。同时给你一个代表查询的整数数组 queries 。 
//
// 第 j 个查询的答案是满足如下条件的点对 (a, b) 的数目： 
//
// 
// a < b 
// cnt 是与 a 或者 b 相连的边的数目，且 cnt 严格大于 queries[j] 。 
// 
//
// 请你返回一个数组 answers ，其中 answers.length == queries.length 且 answers[j] 是第 j 个查询的答
//案。 
//
// 请注意，图中可能会有 重复边 。 
//
// 
//
// 示例 1： 
// 
// 
//输入：n = 4, edges = [[1,2],[2,4],[1,3],[2,3],[2,1]], queries = [2,3]
//输出：[6,5]
//解释：每个点对中，与至少一个点相连的边的数目如上图所示。
// 
//
// 示例 2： 
//
// 
//输入：n = 5, edges = [[1,5],[1,5],[3,4],[2,5],[1,3],[5,1],[2,3],[2,5]], queries =
// [1,2,3,4,5]
//输出：[10,10,9,8,6]
// 
//
// 
//
// 提示： 
//
// 
// 2 <= n <= 2 * 10⁴ 
// 1 <= edges.length <= 10⁵ 
// 1 <= ui, vi <= n 
// ui != vi 
// 1 <= queries.length <= 20 
// 0 <= queries[j] < edges.length 
// 
//
// Related Topics 图 数组 双指针 二分查找 排序 👍 83 👎 0


class P_1782_CountPairsOfNodes{
    public static void main(String[] args) {
        Solution solution = new P_1782_CountPairsOfNodes().new Solution();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int edgeLength = scanner.nextInt();
        int[][] edges = new int[edgeLength][2];
        for (int i = 0; i < edgeLength; i++) {
            edges[i][0] = scanner.nextInt();
            edges[i][1] = scanner.nextInt();
        }
        int queriesLength = scanner.nextInt();
        int[] queries = new int[queriesLength];
        for (int i = 0; i < queriesLength; i++) {
            queries[i] = scanner.nextInt();
        }
        System.out.println(n);
        System.out.println(Arrays.toString(edges));
        System.out.println(Arrays.toString(queries));

        int[] out = solution.countPairs(n,edges,queries);
        System.out.println(Arrays.toString(out));
        /*
        4
        5
        1 2 2 4 1 3 2 3 2 1
        2
        2 3
         */

    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] countPairs(int n, int[][] edges, int[] queries) {
        int[] degree = new int[n];
        Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();
        for(int[] edge:edges){
            int x = edge[0]-1,y=edge[1]-1;
            if (x>y){
                int temp = x;
                x = y;
                y = temp;
            }
            degree[x]++;
            degree[y]++;
            cnt.put(x * n + y,cnt.getOrDefault(x * n + y, 0)+1);
        }
        int[] arr = Arrays.copyOf(degree,n);
        int[] ans = new int[queries.length];
        Arrays.sort(arr);
        for (int i = 0; i < queries.length; i++) {
            int bound = queries[i],total = 0;
            for (int j = 0; j < n; j++) {
                int k = binarySearch(arr,j+1,n-1,bound-arr[j]);
                total += n - k;
            }
            for(Map.Entry<Integer,Integer> entry:cnt.entrySet()){
                int val = entry.getKey(),freq = entry.getValue();
                int x = val / n, y = val % n;
                if(degree[x] + degree[y] > bound && degree[x] + degree[y] -freq <= bound){
                    total --;
                }
            }
            ans[i] = total;
        }
        return ans;
    }
    public int binarySearch(int[] arr,int left,int right,int target){
        int ans = right + 1;
        while(left <= right){
            int mid = (left + right)>>1;
            if(arr[mid] <= target){
                left = mid+1;
            }else{
                right = mid -1;
                ans = mid;
            }
        }
        return ans;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}
