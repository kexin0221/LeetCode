package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findMaxLength(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) nums[i] = -1;
        }
        int maxLength = 0, sum = 0;
        for (int i = 0; i < nums.length-1; i++) {
            sum += nums[i];
            for (int j = i+1; j < nums.length; j++) {

            }
        }
        return maxLength;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
