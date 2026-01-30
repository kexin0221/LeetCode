package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution209 {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE, n = nums.length, sum = 0;
        for (int left = 0, right = 0; right < n; right++) {
            sum += nums[right];
            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left++];
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
