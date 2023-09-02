//给你一个长度为 n ，下标从 0 开始的整数数组 forts ，表示一些城堡。forts[i] 可以是 -1 ，0 或者 1 ，其中： 
//
// 
// -1 表示第 i 个位置 没有 城堡。 
// 0 表示第 i 个位置有一个 敌人 的城堡。 
// 1 表示第 i 个位置有一个你控制的城堡。 
// 
//
// 现在，你需要决定，将你的军队从某个你控制的城堡位置 i 移动到一个空的位置 j ，满足： 
//
// 
// 0 <= i, j <= n - 1 
// 军队经过的位置 只有 敌人的城堡。正式的，对于所有 min(i,j) < k < max(i,j) 的 k ，都满足 forts[k] == 0 。 
// 
//
// 当军队移动时，所有途中经过的敌人城堡都会被 摧毁 。 
//
// 请你返回 最多 可以摧毁的敌人城堡数目。如果 无法 移动你的军队，或者没有你控制的城堡，请返回 0 。 
//
// 
//
// 示例 1： 
//
// 输入：forts = [1,0,0,-1,0,0,0,0,1]
//输出：4
//解释：
//- 将军队从位置 0 移动到位置 3 ，摧毁 2 个敌人城堡，位置分别在 1 和 2 。
//- 将军队从位置 8 移动到位置 3 ，摧毁 4 个敌人城堡。
//4 是最多可以摧毁的敌人城堡数目，所以我们返回 4 。
// 
//
// 示例 2： 
//
// 输入：forts = [0,0,1,-1]
//输出：0
//解释：由于无法摧毁敌人的城堡，所以返回 0 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= forts.length <= 1000 
// -1 <= forts[i] <= 1 
// 
//
// Related Topics 数组 双指针 👍 9 👎 0


package leetcode.editor.cn;

/**
 * @id 2511
 * @title 最多可以摧毁的敌人城堡数目
 * @author ouyang
 * @date 2023-09-02 00:25:19
 */

class P_2511_MaximumEnemyFortsThatCanBeCaptured{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_2511_MaximumEnemyFortsThatCanBeCaptured().new Solution();
		  int[] forts = new int[]{1,0,0,-1,0,0,0,0,1};
		 System.out.println(solution.captureForts(forts));
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int captureForts(int[] forts) {
		int len = forts.length;
		int ans = 0, pre = -1;
		for (int i = 0; i < len; i++) {
			if(forts[i] == 1 || forts[i] == -1){
				if(pre >= 0 && forts[i] != forts[pre]){
					ans = Math.max(ans,i-pre-1);
				}
				pre = i;
			}
		}
		return ans;
		/*
		int len = forts.length;
		int maxCount = 0;
		for (int i = 0; i < len; i++) {
			int temp = 0;
			if(forts[i]==1){
				for (int j = i+1; j < len; j++) {
					if(forts[j] == -1){
						maxCount = Math.max(temp,maxCount);
						break;
					}else if(forts[j] == 1){
						break;
					}
					temp++;
				}
			}else if(forts[i] == -1){
				maxCount = Math.max(temp,maxCount);
			}
		}
		for (int i = len-1; i >= 0; i--) {
			int temp = 0;
			if(forts[i]==1){
				for (int j = i-1; j>=0; j--) {
					if(forts[j] == -1){
						maxCount = Math.max(temp,maxCount);
						break;
					}else if(forts[j] == 1){
						break;
					}
					temp++;
				}
			}else if(forts[i] == -1){
				maxCount = Math.max(temp,maxCount);
			}
		}
		return maxCount;
		 */
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
