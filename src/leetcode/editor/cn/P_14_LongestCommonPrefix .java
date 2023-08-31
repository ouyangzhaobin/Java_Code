//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 
//
// 示例 1： 
//
// 
//输入：strs = ["flower","flow","flight"]
//输出："fl"
// 
//
// 示例 2： 
//
// 
//输入：strs = ["dog","racecar","car"]
//输出：""
//解释：输入不存在公共前缀。 
//
// 
//
// 提示： 
//
// 
// 1 <= strs.length <= 200 
// 0 <= strs[i].length <= 200 
// strs[i] 仅由小写英文字母组成 
// 
//
// Related Topics 字典树 字符串 👍 2891 👎 0


package leetcode.editor.cn;

/**
 * @id 14
 * @title 最长公共前缀
 * @author ouyang
 * @date 2023-08-31 13:41:25
 */

class P_14_LongestCommonPrefix{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_14_LongestCommonPrefix().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
		if(strs == null || strs.length == 0){
			return "";
		}
		String prefix = strs[0];
		int len = strs.length;
		for (int i = 0; i < len; i++) {
			prefix = longestCommonPrefix(prefix,strs[i]);
			if(prefix.length() == 0){
				break;
			}
		}
		return prefix;
    }
	public String longestCommonPrefix(String str1,String str2){
		int len = Math.min(str1.length(),str2.length());
		int index = 0;
		while (index < len && str1.charAt(index) == str2.charAt(index)){
			index++;
		}
		return str1.substring(0,index);
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
