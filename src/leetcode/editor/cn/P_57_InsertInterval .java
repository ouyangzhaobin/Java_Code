//给你一个 无重叠的 ，按照区间起始端点排序的区间列表。 
//
// 在列表中插入一个新的区间，你需要确保列表中的区间仍然有序且不重叠（如果有必要的话，可以合并区间）。 
//
// 
//
// 示例 1： 
//
// 
//输入：intervals = [[1,3],[6,9]], newInterval = [2,5]
//输出：[[1,5],[6,9]]
// 
//
// 示例 2： 
//
// 
//输入：intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
//输出：[[1,2],[3,10],[12,16]]
//解释：这是因为新的区间 [4,8] 与 [3,5],[6,7],[8,10] 重叠。 
//
// 示例 3： 
//
// 
//输入：intervals = [], newInterval = [5,7]
//输出：[[5,7]]
// 
//
// 示例 4： 
//
// 
//输入：intervals = [[1,5]], newInterval = [2,3]
//输出：[[1,5]]
// 
//
// 示例 5： 
//
// 
//输入：intervals = [[1,5]], newInterval = [2,7]
//输出：[[1,7]]
// 
//
// 
//
// 提示： 
//
// 
// 0 <= intervals.length <= 10⁴ 
// intervals[i].length == 2 
// 0 <= intervals[i][0] <= intervals[i][1] <= 10⁵ 
// intervals 根据 intervals[i][0] 按 升序 排列 
// newInterval.length == 2 
// 0 <= newInterval[0] <= newInterval[1] <= 10⁵ 
// 
//
// Related Topics 数组 👍 741 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * @id 57
 * @title 插入区间
 * @author ouyang
 * @date 2023-08-28 01:11:47
 */

class P_57_InsertInterval{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_57_InsertInterval().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
		int len = intervals.length;
		List<int[]> ansList = new ArrayList<int[]>();
		int left = newInterval[0];
		int right = newInterval[1];
		boolean placed = false;
		for (int i = 0; i < len; i++) {
			if(intervals[i][0] > right){
				if(!placed){
					ansList.add(new int[]{left,right});
					placed = true;
				}
				ansList.add(intervals[i]);
			}else if(intervals[i][1] < left){
				ansList.add(intervals[i]);
			}else{
				left = Math.min(left,intervals[i][0]);
				right = Math.max(right,intervals[i][1]);
			}
		}
		if(!placed){
			ansList.add(new int[]{left,right});
		}
		int[][] ans = new int[ansList.size()][2];
		for (int i = 0; i < ansList.size(); i++) {
			ans[i] = ansList.get(i);
		}
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
