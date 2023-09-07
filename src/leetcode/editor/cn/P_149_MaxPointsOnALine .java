//给你一个数组 points ，其中 points[i] = [xi, yi] 表示 X-Y 平面上的一个点。求最多有多少个点在同一条直线上。 
//
// 
//
// 示例 1： 
// 
// 
//输入：points = [[1,1],[2,2],[3,3]]
//输出：3
// 
//
// 示例 2： 
// 
// 
//输入：points = [[1,1],[3,2],[5,3],[4,1],[2,3],[1,4]]
//输出：4
// 
//
// 
//
// 提示： 
//
// 
// 1 <= points.length <= 300 
// points[i].length == 2 
// -10⁴ <= xi, yi <= 10⁴ 
// points 中的所有点 互不相同 
// 
//
// Related Topics 几何 数组 哈希表 数学 👍 510 👎 0


package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * @id 149
 * @title 直线上最多的点数
 * @author ouyang
 * @date 2023-09-07 11:39:51
 */

class P_149_MaxPointsOnALine{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_149_MaxPointsOnALine().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxPoints(int[][] points) {
		int n = points.length;
		if(n <= 2){
			return n;
		}
		int res = 0;
		for (int i = 0; i < n; i++) {
			if(res >= n - i || res > n / 2){
				break;
			}
			Map<Integer,Integer> map = new HashMap<>();
			for (int j = i + 1; j < n; j++) {
				int x = points[i][0] - points[j][0];
				int y = points[i][1] - points[j][1];
				if (x == 0) {
					y = 1;
				} else if (y == 0) {
					x = 1;
				} else {
					if (y < 0) {
						x = -x;
						y = -y;
					}
					int gcdXY = gcd(Math.abs(x), Math.abs(y));
					x /= gcdXY;
					y /= gcdXY;
				}
				int key = y + x * 20001;
				map.put(key, map.getOrDefault(key, 0) + 1);
			}
			int maxn = 0;
			for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
				int num = entry.getValue();
				maxn = Math.max(maxn, num + 1);
			}
			res = Math.max(res, maxn);
		}
		return res;
    }

	public int gcd(int a, int b){
		return b != 0 ? gcd(b, a % b) : a;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
