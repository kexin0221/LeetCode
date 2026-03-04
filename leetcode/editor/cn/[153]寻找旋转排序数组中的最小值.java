package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution153 {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
