//给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 
//
// 示例 2: 
//
// 
//输入: s = "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
// 
//
// 示例 3: 
//
// 
//输入: s = "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
// 
//
// 
//
// 提示： 
//
// 
// 0 <= s.length <= 5 * 10⁴ 
// s 由英文字母、数字、符号和空格组成 
// 
//
// Related Topics 哈希表 字符串 滑动窗口 👍 9632 👎 0


package leetcode.editor.cn;

import java.nio.charset.CharsetDecoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @id 3
 * @title 无重复字符的最长子串
 * @author ouyang
 * @date 2023-09-18 10:58:00
 */

class P_3_LongestSubstringWithoutRepeatingCharacters{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_3_LongestSubstringWithoutRepeatingCharacters().new Solution();
		  String s = " ";
		 System.out.println(solution.lengthOfLongestSubstring(s));
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
		int length = s.length();
		if (length == 0) {
			return 0;
		}
		int start = 0;
		int ans = 0;
		Map<Character,Integer> map = new HashMap<>();
		for (int i = 0; i < length; i++) {
			if (map.containsKey(s.charAt(i))) {
				start = Math.max(start,map.get(s.charAt(i)) + 1);
			}
			map.put(s.charAt(i),i);
			ans = Math.max(ans,i - start + 1);
		}
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
