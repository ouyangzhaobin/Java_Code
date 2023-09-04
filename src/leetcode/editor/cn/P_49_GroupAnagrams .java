//给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。 
//
// 字母异位词 是由重新排列源单词的所有字母得到的一个新单词。 
//
// 
//
// 示例 1: 
//
// 
//输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
//输出: [["bat"],["nat","tan"],["ate","eat","tea"]] 
//
// 示例 2: 
//
// 
//输入: strs = [""]
//输出: [[""]]
// 
//
// 示例 3: 
//
// 
//输入: strs = ["a"]
//输出: [["a"]] 
//
// 
//
// 提示： 
//
// 
// 1 <= strs.length <= 10⁴ 
// 0 <= strs[i].length <= 100 
// strs[i] 仅包含小写字母 
// 
//
// Related Topics 数组 哈希表 字符串 排序 👍 1596 👎 0


package leetcode.editor.cn;

import java.util.*;

/**
 * @id 49
 * @title 字母异位词分组
 * @author ouyang
 * @date 2023-09-03 23:13:56
 */

class P_49_GroupAnagrams{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_49_GroupAnagrams().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
		int len = strs.length;
		Map<String,List<String>> map = new HashMap<>();
		for (String str : strs) {
			char[] array = str.toCharArray();
			Arrays.sort(array);
			String key = new String(array);
			// getOrDefault 方法是接口中提供的一个用于查询 Map 类型中指定元素的方法
			// 其参数是一个 Key,返回的是对应的value,如果查询不到,就返回默认值
			List<String> list = map.getOrDefault(key, new ArrayList<String>());
			list.add(str);
			map.put(key,list);
		}
		return new ArrayList<List<String>>(map.values());
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
