package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLastWord(String s) {
        String[] strArr = s.split(" ");
        return strArr[strArr.length - 1].length();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
