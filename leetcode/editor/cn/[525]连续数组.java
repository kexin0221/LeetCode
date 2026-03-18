package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findMaxLength(int[] nums) {
        int maxLength = 0;
        if (nums.length == 1) return 0;
        for (int i = 0; i < nums.length-1; i++) {
            int sum = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                sum += nums[j];
                int curLength = j - i + 1;
                if (sum * 2 == curLength) {
                    maxLength = Math.max(maxLength, curLength);
                }
            }
        }
        return maxLength;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
