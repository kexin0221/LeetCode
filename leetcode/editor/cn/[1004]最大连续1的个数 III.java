package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLen = 0;
        // 滑动窗口中0的个数不超过k
        int left = 0, right = 0;
        int count = 0;
        while (right < nums.length) {
            if (nums[right] == 0) count++;
            while (count > k) {
                if (nums[left++] == 0) count--;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
