//给定一个单词数组 words 和一个长度 maxWidth ，重新排版单词，使其成为每行恰好有 maxWidth 个字符，且左右两端对齐的文本。 
//
// 你应该使用 “贪心算法” 来放置给定的单词；也就是说，尽可能多地往每行中放置单词。必要时可用空格 ' ' 填充，使得每行恰好有 maxWidth 个字符。
// 
//
// 要求尽可能均匀分配单词间的空格数量。如果某一行单词间的空格不能均匀分配，则左侧放置的空格数要多于右侧的空格数。 
//
// 文本的最后一行应为左对齐，且单词之间不插入额外的空格。 
//
// 注意: 
//
// 
// 单词是指由非空格字符组成的字符序列。 
// 每个单词的长度大于 0，小于等于 maxWidth。 
// 输入单词数组 words 至少包含一个单词。 
// 
//
// 
//
// 示例 1: 
//
// 
//输入: words = ["This", "is", "an", "example", "of", "text", "justification."], 
//maxWidth = 16
//输出:
//[
//   "This    is    an",
//   "example  of text",
//   "justification.  "
//]
// 
//
// 示例 2: 
//
// 
//输入:words = ["What","must","be","acknowledgment","shall","be"], maxWidth = 16
//输出:
//[
//  "What   must   be",
//  "acknowledgment  ",
//  "shall be        "
//]
//解释: 注意最后一行的格式应为 "shall be    " 而不是 "shall     be",
//     因为最后一行应为左对齐，而不是左右两端对齐。       
//     第二行同样为左对齐，这是因为这行只包含一个单词。
// 
//
// 示例 3: 
//
// 
//输入:words = ["Science","is","what","we","understand","well","enough","to",
//"explain","to","a","computer.","Art","is","everything","else","we","do"]，maxWidth = 2
//0
//输出:
//[
//  "Science  is  what we",
//  "understand      well",
//  "enough to explain to",
//  "a  computer.  Art is",
//  "everything  else  we",
//  "do                  "
//]
// 
//
// 
//
// 提示: 
//
// 
// 1 <= words.length <= 300 
// 1 <= words[i].length <= 20 
// words[i] 由小写英文字母和符号组成 
// 1 <= maxWidth <= 100 
// words[i].length <= maxWidth 
// 
//
// Related Topics 数组 字符串 模拟 👍 364 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * @id 68
 * @title 文本左右对齐
 * @author ouyang
 * @date 2023-09-01 11:38:41
 */

class P_68_TextJustification{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P_68_TextJustification().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
		List<String> ans = new ArrayList<String>();
		int wordsIndex = 0,wordsLength = words.length;
		while(true){
			int index = wordsIndex;
			int sumLen = 0;
			while(wordsIndex < wordsLength && sumLen + words[wordsIndex].length() + wordsIndex - index <= maxWidth){
				sumLen += words[wordsIndex++].length();
			}

			// 当前为最后一行，单词左对齐，且单词之间只有一个空格，在行末补充剩余空格
			if(wordsIndex == wordsLength){
				StringBuffer stringBuffer = join(words,index,wordsLength," ");
				stringBuffer.append(blank(maxWidth-stringBuffer.length()));
				ans.add(stringBuffer.toString());
				return ans;
			}

			int numWords = wordsIndex - index;
			int numSpaces = maxWidth - sumLen;

			// 当前行只有一个单词：该单词左对齐，在行末填充剩余空格
			if (numWords == 1) {
				StringBuffer stringBuffer = new StringBuffer(words[index]);
				stringBuffer.append(blank(numSpaces));
				ans.add(stringBuffer.toString());
				continue;
			}

			// 当前行不只一个单词
			int avgSpaces = numSpaces / (numWords - 1);
			int extraSpaces = numSpaces % (numWords - 1);
			StringBuffer stringBuffer = new StringBuffer();
			stringBuffer.append(join(words, index, index + extraSpaces + 1, blank(avgSpaces + 1))); // 拼接额外加一个空格的单词
			stringBuffer.append(blank(avgSpaces));
			stringBuffer.append(join(words, index + extraSpaces + 1, wordsIndex, blank(avgSpaces))); // 拼接其余单词
			ans.add(stringBuffer.toString());
		}
	}


	public String blank(int n){
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < n; i++) {
			stringBuffer.append(' ');
		}
		return stringBuffer.toString();
	}

	public StringBuffer join(String[] words, int left, int right, String seq){
		StringBuffer stringBuffer = new StringBuffer(words[left]);
		for (int i = left+1; i < right; i++) {
			stringBuffer.append(seq);
			stringBuffer.append(words[i]);
		}
		return stringBuffer;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
