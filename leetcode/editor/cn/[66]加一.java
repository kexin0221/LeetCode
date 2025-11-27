package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1]++;
            return digits;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
