//给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串。如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。 
//
// 
//
// 注意： 
//
// 
// 对于 t 中重复字符，我们寻找的子字符串中该字符数量必须不少于 t 中该字符数量。 
// 如果 s 中存在这样的子串，我们保证它是唯一的答案。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "ADOBECODEBANC", t = "ABC"
//输出："BANC"
//解释：最小覆盖子串 "BANC" 包含来自字符串 t 的 'A'、'B' 和 'C'。
// 
//
// 示例 2： 
//
// 
//输入：s = "a", t = "a"
//输出："a"
//解释：整个字符串 s 是最小覆盖子串。
// 
//
// 示例 3: 
//
// 
//输入: s = "a", t = "aa"
//输出: ""
//解释: t 中两个字符 'a' 均应包含在 s 的子串中，
//因此没有符合条件的子字符串，返回空字符串。 
//
// 
//
// 提示： 
//
// 
// m == s.length 
// n == t.length 
// 1 <= m, n <= 10⁵ 
// s 和 t 由英文字母组成 
// 
//
// 
//进阶：你能设计一个在 
//o(m+n) 时间内解决此问题的算法吗？
//
// Related Topics 哈希表 字符串 滑动窗口 👍 2664 👎 0


package leetcode.editor.cn;

import java.sql.RowId;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @id 76
 * @title 最小覆盖子串
 * @author ouyang
 * @date 2023-09-19 11:19:39
 */

class P_76_MinimumWindowSubstring{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_76_MinimumWindowSubstring().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	Map<Character,Integer> origin = new HashMap<>();
	Map<Character,Integer> cnt = new HashMap<>();

    public String minWindow(String s, String t) {
		 int sLength = s.length();
		 int tLength = t.length();
		for (int i = 0; i < tLength; i++) {
			origin.put(t.charAt(i),origin.getOrDefault(t.charAt(i),0) + 1);
		}
		int left = 0, right = -1;
		int length = Integer.MAX_VALUE, ansL = -1, ansR = -1;
		while(right < sLength){
			++right;
			if(right < sLength && origin.containsKey(s.charAt(right))){
				cnt.put(s.charAt(right),cnt.getOrDefault(s.charAt(right),0) + 1);
			}
			while(check() && left <= right){
				if(right - left + 1 < length){
					length = right - left + 1;
					ansL = left;
					ansR = left + length;
				}
				if (origin.containsKey(s.charAt(left))) {
					cnt.put(s.charAt(left),cnt.getOrDefault(s.charAt(left), 0) - 1);
				}
				++left;
			}
		}
		return ansL == -1 ? "" : s.substring(ansL,ansR);
    }
	public boolean check() {
		Iterator iter = origin.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			Character key = (Character) entry.getKey();
			Integer val = (Integer) entry.getValue();
			if (cnt.getOrDefault(key, 0) < val) {
				return false;
			}
		}
		return true;
	}

}
//leetcode submit region end(Prohibit modification and deletion)

}
