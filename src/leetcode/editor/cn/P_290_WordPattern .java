//给定一种规律 pattern 和一个字符串 s ，判断 s 是否遵循相同的规律。 
//
// 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 s 中的每个非空单词之间存在着双向连接的对应规律。 
//
// 
//
// 示例1: 
//
// 
//输入: pattern = "abba", s = "dog cat cat dog"
//输出: true 
//
// 示例 2: 
//
// 
//输入:pattern = "abba", s = "dog cat cat fish"
//输出: false 
//
// 示例 3: 
//
// 
//输入: pattern = "aaaa", s = "dog cat cat dog"
//输出: false 
//
// 
//
// 提示: 
//
// 
// 1 <= pattern.length <= 300 
// pattern 只包含小写英文字母 
// 1 <= s.length <= 3000 
// s 只包含小写英文字母和 ' ' 
// s 不包含 任何前导或尾随对空格 
// s 中每个单词都被 单个空格 分隔 
// 
//
// Related Topics 哈希表 字符串 👍 596 👎 0


package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * @id 290
 * @title 单词规律
 * @author ouyang
 * @date 2023-09-03 13:44:46
 */

class P_290_WordPattern{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_290_WordPattern().new Solution();
		  String pattern = "abba";
		  String s = "dog cat cat dog";
		 System.out.println(solution.wordPattern(pattern, s));
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean wordPattern(String pattern, String s) {
		Map<Character,String> map1 = new HashMap<>();
		Map<String,Character> map2 = new HashMap<>();
		String[] split = s.split(" ");
		int len1 = pattern.length();
		int len2 = split.length;
		if(len1 != len2){
			return false;
		}
		for (int i = 0; i < len1; i++) {
			char key = pattern.charAt(i);
			if((map1.containsKey(key) && !map1.get(key).equals(split[i])) || (map2.containsKey(split[i]) && map2.get(split[i]) != key)) {
				return false;
			}
			map1.put(key,split[i]);
			map2.put(split[i],key);
		}
		return true;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
