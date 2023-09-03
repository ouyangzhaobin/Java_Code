//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。 
//
// 注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "anagram", t = "nagaram"
//输出: true
// 
//
// 示例 2: 
//
// 
//输入: s = "rat", t = "car"
//输出: false 
//
// 
//
// 提示: 
//
// 
// 1 <= s.length, t.length <= 5 * 10⁴ 
// s 和 t 仅包含小写字母 
// 
//
// 
//
// 进阶: 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？ 
//
// Related Topics 哈希表 字符串 排序 👍 839 👎 0


package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * @id 242
 * @title 有效的字母异位词
 * @author ouyang
 * @date 2023-09-03 13:57:54
 */

class P_242_ValidAnagram{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_242_ValidAnagram().new Solution();
		  String s = "anagram";
		  String t = "nagaram";
		 System.out.println(solution.isAnagram(s, t));
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isAnagram(String s, String t) {
		Map<Character,Integer> map = new HashMap<>();
		int sLength = s.length();
		int tLength = t.length();
		if(sLength != tLength){
			return false;
		}
		for (int i = 0; i < sLength; i++) {
			char key = s.charAt(i);
			if(map.containsKey(key)){
				Integer value = map.get(key) + 1;
				map.put(key,value);
			}else{
				map.put(key,1);
			}
		}
		for (int i = 0; i < tLength; i++) {
			char key = t.charAt(i);
			if(map.containsKey(key) && map.get(key) != 0){
				Integer value = map.get(key) -1;
				map.put(key,value);
			}else {
				return false;
			}
		}
		return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
