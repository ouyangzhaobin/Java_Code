//给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串的第一个匹配项的下标（下标从 0 开始）。
//如果 needle 不是 haystack 的一部分，则返回 -1 。 
//
// 
//
// 示例 1： 
//
// 
//输入：haystack = "sadbutsad", needle = "sad"
//输出：0
//解释："sad" 在下标 0 和 6 处匹配。
//第一个匹配项的下标是 0 ，所以返回 0 。
// 
//
// 示例 2： 
//
// 
//输入：haystack = "leetcode", needle = "leeto"
//输出：-1
//解释："leeto" 没有在 "leetcode" 中出现，所以返回 -1 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= haystack.length, needle.length <= 10⁴ 
// haystack 和 needle 仅由小写英文字符组成 
// 
//
// Related Topics 双指针 字符串 字符串匹配 👍 1985 👎 0


package leetcode.editor.cn;

/**
 * @id 28
 * @title 找出字符串中第一个匹配项的下标
 * @author ouyang
 * @date 2023-09-01 11:22:05
 */

class P_28_FindTheIndexOfTheFirstOccurrenceInAString{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_28_FindTheIndexOfTheFirstOccurrenceInAString().new Solution();
		String haystack = "sadbutsad";
		String needle = "sad";
		 System.out.println(solution.strStr(haystack, needle));
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int strStr(String haystack, String needle) {
		int len1 = haystack.length(), len2 = needle.length();
		char[] haystackArray = haystack.toCharArray(), needleArray = needle.toCharArray();
		for (int i = 0; i <= len1-len2; i++) {
			int a = i,b=0;
			while(b < len2 && haystackArray[a] == needleArray[b]){
				a++;
				b++;
			}
			if (b==len2) {
				return i;
			}
		}
		return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
